package me.euichan.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConf2.class)
public class AppConfImport {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
