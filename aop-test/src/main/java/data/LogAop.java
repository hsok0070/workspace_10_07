package data;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		
		String asd = joinpoint.getSignature().toShortString();
		System.out.println(asd + "핵심메소드 동작start");
	
		System.out.println("핵심 기능 전 공통 기능 실행");
		
		try {
		Object obj = joinpoint.proceed();
		return obj;
		}finally {
			System.out.println("핵심 기능 후 공통 기능 실행");
			System.out.println(asd + "끝");
		}
	}

}
