package basic07;

import org.springframework.stereotype.Component;

// Component에서 참조 변수 이름을 따로 지정할 수 있다!
@Component("msgEn")
public class MessageBeanEn implements MessageBean{
	private String name;
	private int age;
	private Outputter outputter;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
	public void setOutputter(Outputter outputter) {
		this.outputter = outputter;
	}


	public void sayHello() {
		System.out.println("My name is " + name + " and my age is " + age);
		try {
			outputter.output("My name is " + name + " and my age is " + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}