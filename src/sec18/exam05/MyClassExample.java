package sec18.exam05;

public class MyClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1)-------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)--------------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		
		System.out.println("3)-------------------");
		
		MyClass myclass3 = new MyClass();
		myclass3.methodA();
		
		System.out.println("4)--------------------");
		
		MyClass myclass4 = new MyClass();
		myclass4.methodB(new Television());
		
	}

}
