package sec33.exam06;

import java.io.*;

public class ReadExample {

	public static void main(String[] args) throws Exception{

		InputStream is = new FileInputStream("C:/Temp/test3.db");
		
		byte[] buffer = new byte[5];
		
		int readByteNum = is.read(buffer,2,3);//2는 인덱스 넘버  3은 3개 불러와라
		if(readByteNum != -1) {
			for(int i=0;i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();
		
	}

}
