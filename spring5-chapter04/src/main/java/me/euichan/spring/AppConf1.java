package me.euichan.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConf1 {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}

	@Bean
	MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
}
