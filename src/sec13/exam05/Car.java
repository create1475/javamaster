package sec13.exam05;



public class Car {

	int speed;
	
	
	int getspeed() {
		return speed;
	}
	
	void keyTurnon() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			speed = i;
			System.out.println("달립니다. (시속: " + speed + "km/h)");//여기는 왜 += 인가 생각해보기
			
		}
	}
	
}
