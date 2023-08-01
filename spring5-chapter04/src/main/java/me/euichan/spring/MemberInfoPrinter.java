package me.euichan.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MemberInfoPrinter {

	@Autowired
	private MemberDao memberDao;

	@Autowired
	private MemberPrinter memberPrinter;

	public void printMemberInfo(String email) {
		final Member member = memberDao.selectByEmail(email);
		if (member == null) {
			System.out.println("데이터 없음\n");
			return;
		}

		memberPrinter.print(member);
		System.out.println();
	}
}
