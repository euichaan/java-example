package me.euichan.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;

public class MemberListPrinter {

	private MemberDao memberDao;
	private MemberPrinter printer;

	public MemberListPrinter(final MemberDao memberDao, @Qualifier("printer") final MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}

	public void printAll() {
		final Collection<Member> members = memberDao.selectAll();
		members.forEach(m -> printer.print(m));	// T -> void
	}
}
