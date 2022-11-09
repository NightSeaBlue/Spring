package aop1_xml;

public class MessageBeanImpl implements MessageBean{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("sayHello() 호출");
	}

	@Override
	public void enSayHello() {
		// TODO Auto-generated method stub
		System.out.println("enSayHello() 호출");
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("test() 호출");
	}

}
