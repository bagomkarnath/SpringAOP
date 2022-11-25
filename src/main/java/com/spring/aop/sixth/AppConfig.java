package com.spring.aop.sixth;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public BookService getBookService() {
		return new BookService();
	}
	
	@Bean
	public SolutionAspect getSolutionAspect() {
		return new SolutionAspect();
	}

}
