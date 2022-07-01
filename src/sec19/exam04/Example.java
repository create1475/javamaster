package sec19.exam04;

public class Example {

	public static void main(String[] args) {
	
		ImplementationC impl = new ImplementationC();
		
		InterfaceA iA = impl;
		iA.methodA();
		System.out.println();
		
		InterfaceB iB = impl;
		iB.methodB();
		System.out.println();
		
		InterfaceC iC = impl;
		iC.methodA();
		iC.methodB();
		iC.methodC();
		
		
		
	}

}
