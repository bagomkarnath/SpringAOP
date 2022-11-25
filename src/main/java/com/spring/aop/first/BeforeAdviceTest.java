package com.spring.aop.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		BookService bookService = ctx.getBean(BookService.class);
		
		bookService.getBookByAuthor();
		
		bookService.addBook();

	}

}
