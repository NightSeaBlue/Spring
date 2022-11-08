package ex3_autowiring;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageBeanImpl implements MessageBean{

	private String name;
	private String message;
	
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	/*@Autowired					//spring annotation
	@Qualifier ("outputer2")	//구체적인 Beans 지정 */
	@Resource(name="outputer2")		// autowired 와 qualifier를 합친것
	private Outputer out;
	
//	@Autowired
//	@Qualifier ("outputer2")
//	private Outputer out2;
	
	// method Override
	@Override	// 자바 어노테이션
	public void sayHello() {
		System.out.println(name+"님께" +message);
		try {
			out.writeMessage(name+"님께" +message);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
}
