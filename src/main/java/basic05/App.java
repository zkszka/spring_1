package basic05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx; // spring 설정 파일 경로를 토대로 스프링 메모리 공간 생성
	
    public static void main( String[] args ){// 설정 파일에서 스프링 공간이 이미 생성되어 객체가 생성되어있다. 
    	 ctx = new ClassPathXmlApplicationContext("config/basic05_config.xml"); // spring 설정 파일 경로지정. ~resource까지는 이미 자동으로 설정되어 있음
         
    	 // 기본 JAVA 방식:생성자를 호출하여 객체 생성
    	 // 문제점:MessageBeanImpl 클래스에 의존도가 매우 높아 해당 클래스가 오류가 있을 시 클래스 자체를 수정해야 함 
    	 // MessageBean bean= new MessageBeamImpl("홍길동", 27, "안녕하세요");
    	 // bean.sayHello();
    	 
    	 
    	 // 스프링에서는 주입받는 클래스를 소비자 클래스(comsumer)라고도 함
    	 // messageBean이라는 참조 변수를 유지보수를 위해 MessageBean 인터페이스 타입으로 받는다.
    	 MessageBean bean = ctx.getBean("messageBean", basic05.MessageBean.class); 
    	 bean.sayHello();
    	 
        
    
    }
}
