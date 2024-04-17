package basic07;

import org.springframework.stereotype.Component;

// Component 어노테이션으로 bean태그를 만들지 않고 클래스의 객체를 생성한다.
@Component
public class MessageBeanKr implements MessageBean{
	private String name;
	private int age;
	private Outputter outputter;
	
	public MessageBeanKr() {}
	
	public MessageBeanKr(String name, int age, Outputter outputter) {
		this.name = name;
		this.age = age;
		this.outputter = outputter;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public void sayHello() {
		System.out.println("나의 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		
		try {
			outputter.output("나의 이름은 " + name + "이고 나이는 " + age + "살 입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
