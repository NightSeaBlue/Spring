package ex2_annotation;

import org.springframework.stereotype.Component;

@Component				//Annotation : Like A Post-it; 스프링이 찾아서 메모리에 올림
public class MemberBean {

	private String name = "홍길동";
	private int  age = 18;
	private String message = "아버지를 아버지라 부르지 못하고...";
	
	//-------------------------
	public void output() {
		System.out.println(name+"["+ age +"]"+message);
	}
	
	
	/*public MemberBean() {
		System.out.println("기본생성자");
	}*/
	
	// 1. constructor 이용
	/*public MemberBean(String name, int age, String message) {
		super();
		this.name = name;
		this.age = age;
		this.message = message;
		System.out.println("인자가 있는 생성자");
	}*/

	// 2. Setter 이용
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}*/
	
}
