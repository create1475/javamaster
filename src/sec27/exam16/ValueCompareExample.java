package sec27.exam16;

public class ValueCompareExample {

	public static void main(String[] args) {
	
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));//저장은 바이트형식으로 저장 그러니 -128~127까지 범위 넘어가면 판별할수 없기때문에 false나오는거임
		System.out.println("언박싱후 == 결과:" + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		
		
		System.out.println("[-128~127 범위값일 경우");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
		
		
	}

}
