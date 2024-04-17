package basic07;

import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter{
// 인사말을 파일에 저장하는 클래스
	
	private String filePath;
	
	// set메서드로 원하는 파일 경로를 생성할 수 있다.
	public void setFilePath(String path) {
		filePath = path;
	}
	
	@Override
	public void output(String msg) throws IOException {
		FileWriter writer = new FileWriter(filePath);
		writer.write(msg);
		writer.close();
	}
	
}
