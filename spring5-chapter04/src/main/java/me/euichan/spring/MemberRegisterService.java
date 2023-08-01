package me.euichan.spring;

import java.time.LocalDateTime;

public class MemberRegisterService {

	private MemberDao memberDao;

	public MemberRegisterService(final MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void regist(RegisterRequest req) {
		final Member member = memberDao.selectByEmail(req.getEmail());
		if (member != null) {
			throw new DuplicateMemberException("dup email " + req.getEmail());
		}

		final Member newMember = new Member(
			req.getEmail(), req.getPassword(), req.getName(), LocalDateTime.now());
		memberDao.insert(newMember);
	}
}
