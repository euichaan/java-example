package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import spring.MemberDao;

@Configuration
@ComponentScan(basePackages = {"spring"},
		excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
public class AppCtxWithExclude {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
}
