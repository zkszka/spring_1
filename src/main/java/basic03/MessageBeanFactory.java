package basic03;

public class MessageBeanFactory {
	private MessageBeanFactory() {}
	private static MessageBeanFactory factory = new MessageBeanFactory();
	public static MessageBeanFactory newInstance() {
		return factory;
	}
	
	public MessageBean createMessage(String nation) { // 인터페이스 타입으로 형 변환하여 리턴
		if(nation.equals("kr")) {
			return new MessageBeanKr();
		}else {
			return new MessageBeanEn();
		}
	}

}
