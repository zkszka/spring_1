package basic06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx; // spring 설정 파일 경로를 토대로 스프링 메모리 공간 생성
	
    public static void main( String[] args ){// 설정 파일에서 스프링 공간이 이미 생성되어 객체가 생성되어있다. 
    	 ctx = new ClassPathXmlApplicationContext("config/basic06_config.xml"); // spring 설정 파일 경로지정. ~resource까지는 이미 자동으로 설정되어 있음
    	 
    	 // AnnotationConfigApplicationContext()는 어노테이션이 붙어있는지 스캔하는 스캐너이다.
    	 // () 안에 특정 패키지명을 넣으면 해당 패키지 내 클래스들만 스캔한다.
    	 //ctx = new AnnotationConfigApplicationContext("basic06");
    	
    	 // 한국어로 자기 소개
    	 // 어노테이션으로 객체를 생성하면 그때 참조변수(객체) 이름은 첫 글자는 소문자인 클래스 이름이다.
         MessageBean bean = ctx.getBean("messageBeanKr", basic06.MessageBean.class);
    	 bean.sayHello();
    	 
    	 // 영어로 자기 소개
    	 bean = ctx.getBean("msgEn", basic06.MessageBean.class);
    	 bean.sayHello();
    	 
    
        
    
    }
}
