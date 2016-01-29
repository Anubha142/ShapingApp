package org.spring.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	@Before("allGetters() && allCircleMethods() ")
	public void loggingAdvice(){
		System.out.println("Advice run. Get methiod called !!");
	}
	
	@AfterReturning(pointcut="args(name)", returning="returnStr")
	public void StringArgumentMethod(String name, String returnStr ){
		System.out.println("Method that takes string args has been called !! returning" + returnStr);
	}
	
	@AfterThrowing(pointcut = "args(name)", throwing= "ex")
	public void exceptionAdvice(String name, Exception ex){
		System.out.println("Exception is thrown !" + ex );
	}
	
	@Pointcut("execution(* get*(..))")
	public void allGetters(){}
	
	@Pointcut("within(org.spring.aop.model.Circle)")
	public void allCircleMethods() {}
	
	

}
