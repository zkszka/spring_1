package basic07;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration 
// Configuratin으로 xml대신 사용할 수 있는 자바파일임을 알린다
public class ApplicationContextConfigure {
// 환경 설정 담당 클래스
	
	@Bean
	//Bean 어노테이션을 달면 아래 메서드는 bean 태그와 같은 역할을 한다.
	public MessageBean getMessageKr() {		
		FileOutputter outputter1 = new FileOutputter();
		outputter1.setFilePath("c:\\dana\\greeting2.txt");
		MessageBeanKr kr = new MessageBeanKr("홍길동", 33, outputter1);
		return kr;
	}
	
	@Bean
	//Bean 어노테이션을 달면 아래 메서드는 bean 태그와 같은 역할을 한다.
	public MessageBean getMessageEn() {
		FileOutputter outputter2 = new FileOutputter();
		outputter2.setFilePath("c:\\dana\\greeting3.txt");
		MessageBeanEn en = new MessageBeanEn();
		 en.setName("TOM");
		 en.setAge(21);
		 en.setOutputter(outputter2);
		 return en;
	}
	
	
	
}
