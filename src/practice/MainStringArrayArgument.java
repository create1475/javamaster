package practice;

public class MainStringArrayArgument {

	public static void main(String[] args) {

		String[] oldintArray = {"java","array","copy"};
		String[] newintarray = new String[5];
		
		System.arraycopy(oldintArray, 0, newintarray, 0, oldintArray.length);
		
		for(int i=0; i<newintarray.length; i++) {
			System.out.println(newintarray[i]+ "," );
			
		}
		
		
		
		
		
		
	}
	
}












