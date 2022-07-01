package sec21.exam02;

public class Anonymous {

	
	RemoteControl field = new RemoteControl() {
		
		@Override
		public void turnon() {
			System.out.println("TV를 켭니다.");
			
		}
		
		@Override
		public void turnoff() {
			System.out.println("TV를 끕니다.");
			
		}
	};
	
	void method1() {
		RemoteControl localvar = new RemoteControl() {
			
			@Override
			public void turnon() {
				System.out.println("Audio를 켭니다.");
				
			}
			
			@Override
			public void turnoff() {
				System.out.println("Audio를 끕니다.");
				
			}
		};
	
		localvar.turnon();
	}
		void method2(RemoteControl rc) {
			rc.turnon();
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


