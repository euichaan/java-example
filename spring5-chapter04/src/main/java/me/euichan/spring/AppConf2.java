package me.euichan.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConf3.class)
public class AppConf2 {

	/**
	 * 필드 인젝션 (Field Injection)
	 * 외부에서 변경이 불가능해서 테스트하기 힘들다
	 * DI 프레임워크가 없으면 아무것도 할 수 없다.
	 *
	 * 테스트 코드나, @Configuration 같은 곳에서만 특별한 용도로 사용 가능하다.
	 */
	@Autowired
	private MemberDao memberDao;

	@Autowired
	private MemberPrinter memberPrinter;

	@Bean
	public MemberRegisterService memberRegisterService() {
		return new MemberRegisterService(memberDao);
	}

	@Bean
	public ChangePasswordService changePasswordService() {
		ChangePasswordService changePasswordService = new ChangePasswordService();
		changePasswordService.setMemberDao(memberDao);
		return changePasswordService;
	}

	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}

	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		// 세터 메서드를 사용해서 의존 주입을 하지 않아도 스프링 컨테이너가 @Autowired를 붙인 필드에 해당 타입의 빈 객체를 주입 해준다.
		// infoPrinter.setMemberDao(memberDao);
		// infoPrinter.setMemberPrinter(memberPrinter);
		return infoPrinter;
	}
}
