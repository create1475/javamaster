import java.util.Scanner;

public class practice14 {

	public static void main(String[] args) {

		
		double [] arr = new double[4];
		
		
		Scanner sc = new Scanner(System.in);
		
		
		double sum = 0;
		double avg = 0;
		
//		for(int i=0; i<arr.length; i++) {
//			int result=Integer.parseInt(sc.nextLine());
//			arr[i] = result;
//			System.out.println("score[" + i + "] =" + arr[i]);
//			sum += result;
//			
//
//		}
		for(int j = 0; j <arr.length;j++) {
			System.out.print("입력할 수를 적어주세요 : ");
			arr[j] = Double.parseDouble(sc.nextLine());
			sum += arr[j];
			
		}
		
		
		for(int i = 0; i<arr.length;i++) {
			
			System.out.println("arr["+ i + "] : " + arr[i]);
			avg = sum/arr.length;
		}
		System.out.printf("avg : %.2f" , avg);
		
		
			
		
		
	}

}
