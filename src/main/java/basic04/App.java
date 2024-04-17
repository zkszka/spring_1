package basic04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx; // spring 설정 파일 경로를 토대로 스프링 메모리 공간 생성
	
    public static void main( String[] args ){// 설정 파일에서 스프링 공간이 이미 생성되어 객체가 생성되어있다. 
    	 ctx = new ClassPathXmlApplicationContext("config/basic04_config.xml"); // spring 설정 파일 경로지정. ~resource까지는 이미 자동으로 설정되어 있음
         
    	 // 클래스에서 basic04클래스 객체를 불러와 그 주소 값을 msgKr에 저장한다.
         MessageBean bean = ctx.getBean("msgKr", basic04.MessageBeanKr.class);
         bean.sayHello("임꺽정");
         bean.sayHello("홍길동");
         
         
         bean = ctx.getBean("msgEn", basic04.MessageBeanEn.class);
         bean.sayHello("TOM");
         bean.sayHello("Jane");
         
         bean = ctx.getBean("kr", basic04.MessageBeanKr.class);
         bean.sayHello("유비");
        
         bean = ctx.getBean("mskr", basic04.MessageBeanKr.class);
         bean.sayHello("관우");
    
        
    
    }
}
