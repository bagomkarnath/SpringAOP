package com.spring.aop.sixth;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SolutionAspect {
	
	@Pointcut("execution (* BookService.get*(..))")
	public void myPointCut() {}
	
	@Around("myPointCut()")
	public Object myAdvice(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before call");
		Object obj = pjp.proceed();
		System.out.println("After call");
		return obj;
	}

}
