package sec20.exam02;
//자바 7 이전
public class Outter {

	public void method1(final int arg) {
		final int localVariable = 1;
		
	class Inner{
		public void method() {
			int result = arg + localVariable;
			
			}
		}
	}
	
	
	//자바 8 이후 여기에는 int arg 에 파이널(final)안써도 안에 들어있다.
	public void method2(int arg) {
		int localVariable = 1;
	class Inner {
		public void method() {
			int result = arg + localVariable;
			
			}
		}
	}
	
}
