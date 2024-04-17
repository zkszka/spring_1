package basic08;

import java.io.FileWriter;
import org.springframework.context.annotation.ComponentScan;


public class FileOutputter implements Outputter{
	private String filePath;
	
	public void setFilePath(String path) {
		filePath = path;
	}
	//인터페이스로부터 
	@Override
	public void output(String msg) throws Exception{
		FileWriter writer = new FileWriter(filePath);
		writer.write(msg);
		writer.close();
	}
	
}
