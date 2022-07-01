package sec20.exam01;

	class A {
		A(){System.out.println("A 객체가 생성됨");}
		
		
	class B {
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		//stastic int field2;
		void method1() {System.out.println("나는 클래스 비 인스턴스 멤버지롱");}
		//static void method2(){}
		
			}
	
	static class C{
		C(){System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {System.out.println("나는 클래스 비 정적멤버 클래스 이지롱");}
		static void method2() {System.out.println("불렀어요 클래스비?");}
					}
		
		void method() {
			class D {
				D(){System.out.println("D객체가 생성됨");}
				int field1;
				//static int field2;
				void method1() {System.out.println("나는 끝나면 사라지는 클래스 D이지롱");}
				//static void method2(){};
				
			}
				D d = new D();
				d.field1 = 3;
				d.method1();
			
		}	
}
