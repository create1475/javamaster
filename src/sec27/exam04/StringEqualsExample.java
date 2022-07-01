package sec27.exam04;

public class StringEqualsExample {

	public static void main(String[] args) {
	
		String strval1 = new String("신민철");
		String Strval2 = "신민철";
		
		if(strval1 == Strval2) {
			System.out.println("같은 STring 객체를 참조");
			
		}else {
			System.out.println("다른 String 객체를 참조");
			
		}
		if(strval1.equals(Strval2)) {
			System.out.println("같은 문자열을 가짐");
			
		}else {
			System.out.println("다른 문자열을 가짐");
			
			
		}
		
		
	}

}
