package basic07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	private static ApplicationContext ctx; // spring 설정 파일 경로를 토대로 스프링 메모리 공간 생성
	
    public static void main( String[] args ){// 설정 파일에서 스프링 공간이 이미 생성되어 객체가 생성되어있다. 
    	// 패키지명이 아닌 Configuration한(=xml 환경변수) 클래스 명을 넣어 스캐닝한다!
    	 ctx = new AnnotationConfigApplicationContext(ApplicationContextConfigure.class);

    	 MessageBean bean = ctx.getBean("getMessageKr", basic07.MessageBean.class);
    	 bean.sayHello();
    	 
    	 bean = ctx.getBean("getMessageEn", basic07.MessageBean.class);
    	 bean.sayHello();
    
        
    
    }
}
