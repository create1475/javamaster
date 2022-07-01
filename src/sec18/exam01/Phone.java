package sec18.exam01;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
		
	}
	public void turnon() {
		System.out.println("폰 전원을 켭니다.");
	}
	public void turnoff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
}
