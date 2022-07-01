package sec20.exam04;

public class BottonExample {

	public static void main(String[] args) {
		
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
		
		
		

	}

}
