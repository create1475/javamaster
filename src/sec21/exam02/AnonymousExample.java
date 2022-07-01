package sec21.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
	
		Anonymous anony = new Anonymous();
		
		anony.field.turnon();
		anony.method1();
		
		anony.method2(
				new RemoteControl() {
					
					@Override
					public void turnon() {
						System.out.println("SmartTv를 켭니다.");
						
					}
					
					@Override
					public void turnoff() {
						System.out.println("SmartTv를 끕니다.");
						
						}
					}
				
				
				
				);
				
		
		
		
	}

}
