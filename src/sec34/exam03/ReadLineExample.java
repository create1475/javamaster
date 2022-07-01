package sec34.exam03;

import java.io.*;

public class ReadLineExample {

	public static void main(String[] args) throws Exception{

		Reader reader = new FileReader("E:/Ohseojun/pro01/bin/sec34/exam03/language.txt");
		
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			String data = br.readLine();
			if(data == null) break;
			System.out.println(data);
			
		}
		br.close();
		
	}

}
