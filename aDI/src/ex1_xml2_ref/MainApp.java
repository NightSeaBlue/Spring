package ex1_xml2_ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ex1_xml1.MessageBean;

public class MainApp {

	public static void main(String[] args) {
		// [1] Spring 설정 파일 연결
		ApplicationContext context = new ClassPathXmlApplicationContext("ex1_xml2_ref/applicationContext.xml");
		
		// [2] 빈 가져오기
		MemberBean bean = context.getBean("member",MemberBean.class);		//빈을 가져올 때 타입이 Object 형이므로 downcasting 필요
		bean.output();
		
		MemberBean bean2 = context.getBean("member2",MemberBean.class);
		bean2.output();
		
		MemberDAO dao1 = context.getBean("dao", MemberDAO.class);
		dao1.insert();
		
		MemberDAO dao2 = context.getBean("dao2", MemberDAO.class);
		dao2.insert();
	}

}
