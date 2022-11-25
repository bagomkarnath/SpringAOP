package com.spring.aop.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.spring.aop.second.TrackBookServiceAfter;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	
	@Bean
	public BookService getBookService() {
		return new BookService();
	}
	
	@Bean
	public TrackBookServiceBefore getTrackBookServiceBefore() {
		return new TrackBookServiceBefore();
	}
	

}
