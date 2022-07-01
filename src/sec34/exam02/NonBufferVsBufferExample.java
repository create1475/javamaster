package sec34.exam02;

import java.io.*;


public class NonBufferVsBufferExample {

	public static void main(String[] args) throws Exception{
		String originalfilepath1 = "E:/Ohseojun/pro01/bin/sec34/exam02/originalfile1.jpg";
		String targetfilepath1 = "C:/Temp/targetfile1.jpg";
		FileInputStream fis = new FileInputStream(originalfilepath1);
		FileOutputStream fos = new FileOutputStream(targetfilepath1);
		
		String originalfilpath2 = "E:/Ohseojun/pro01/bin/sec34/exam02/originalfile2.jpg";//자바식으로 바꿔야 하고 이름까지 써줘야 한다.
		String targetfilepath2 = "C:/Temp/targetfile2.jpg";
		FileInputStream fis2 = new FileInputStream(originalfilpath2);
		FileOutputStream fos2 = new FileOutputStream(targetfilepath2);
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼를 사용하지 않았을때 : \t" + nonBufferTime + "ns");
		
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼를 사용했을 떄 : \t\t" + bufferTime + "ns");
		
		fis.close();
		fos.close();
		bis.close();
		bos.close();
		
		
		
		
		
	}

	static int data = -1;
	public static long copy(InputStream is,OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1) break;
			os.write(data);
			
		}
	os.flush();
	long end = System.nanoTime();
	return (end-start);
	
	}
}
