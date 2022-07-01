package sec25.exam03;

public class ExitExample {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);
				break;
				
				
			}else if(i > 6) {
				System.out.println("마무리코드");
				
			}
			
				
			
			
			System.out.println(i);
			
				
		}
		
		System.out.println("마무리 코드");
		
		
		
	}

}
