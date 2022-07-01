package sec29.exam03;

public class ThreadA extends Thread{

	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
	
}
//이방법을 더 선호한다.
//B방법은 선호하지 않는다.
