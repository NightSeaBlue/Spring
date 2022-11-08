package ex3_autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ex3_autowiring/applicationContext.xml");
		
		MessageBean bean = (MessageBean) context.getBean("message",MessageBeanImpl.class);
		bean.sayHello();

	}

}
