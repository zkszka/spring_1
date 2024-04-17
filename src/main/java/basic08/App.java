package basic08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext ctx;
    public static void main( String[] args )    {
    	/*
    	옛날 방식 
    	MessageBeanImpl bean=new MessageBeanImpl();
    	FileOutputter outputter = new FileOutputter();
    	outputter.setFilePath("C:\\user\\seunghee\\BackEdnd\\SpringWork\\STSWork\\greetingg.txt");
    	bean.setOutputter(outputter);
    	bean.setName("홍길동");
    	bean.setAge(18);
    	bean.sayHello();
    	*/
    	/*
    	ctx=new ClassPathXmlApplicationContext("config/basic08_config.xml");
    	MessageBean bean=ctx.getBean("messageBean", MessageBean.class);
    	bean.sayHello();
    	*/
    	/*어노테이션 사용하기 1) AnnotationConfigApplicationContext으로 변경하기
    	 2) 설정파일에 스캐너 설치하기*/
    	ctx=new ClassPathXmlApplicationContext("config/basic08_config.xml");
    	MessageBean bean=ctx.getBean("messageBean", MessageBean.class);
    	bean.sayHello();
    }
}
