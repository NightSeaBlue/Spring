package aop2_annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component // Bean 생성
@Aspect // AOP 지정
@Order(2)
public class LoggingAdvice {
	@Before("execution(public * aop2_annotation.*.*Hello(..))") // Before	
	public void before(JoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("[********사전 작업]" + methodName);
	}

	@After("execution(public * aop2_annotation.*.*Hello(..))") // After
	public void after(JoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("[********사후 작업]" + methodName);
	}

}
