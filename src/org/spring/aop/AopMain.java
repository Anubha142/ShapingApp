package org.spring.aop;

import org.spring.aop.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeSrv = ctx.getBean("shapeService", ShapeService.class);
		shapeSrv.getCircle().setNameAndReturn("Dummy Name");
		//shapeSrv.getCircle().setName("Dummy Name");
		//System.out.println(shapeSrv.getCircle().getName());
	}
}
