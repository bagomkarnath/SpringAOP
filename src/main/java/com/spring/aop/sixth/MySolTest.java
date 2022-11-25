package com.spring.aop.sixth;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySolTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bService = ctx.getBean(BookService.class);
		
		bService.addBook();
		
		bService.getBookByAuthor();
		
		bService.deleteBook();

	}

}
