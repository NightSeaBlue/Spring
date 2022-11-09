package aop2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAPP {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop2_annotation/applicationContext.xml");
		
		MessageBean bean =(MessageBean)context.getBean("targetBean");
		
		bean.sayHello();
		System.out.println("=================================");
		bean.enSayHello();
		System.out.println("====================================");
		bean.test();

	}

}
