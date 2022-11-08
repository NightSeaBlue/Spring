package ex2_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// [1] Spring 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex2_annotation/applicationContext.xml");
		
		MemberDAO dao = context.getBean("dao", MemberDAO.class);
		//MemberDAO dao = context.getBean("memberDAO", MemberDAO.class);	// component 로 메모리에 올릴경우 Spring 에서 Class Name을 찾아, 첫 시작글자를 소문자로 down grade해 ID를 지정함
		
		dao.insert();

	}

}
