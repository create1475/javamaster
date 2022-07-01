package sec17.exam03;


public class Car {

	Tire frontLeftTire = new Tire("앞왼쪽" , 11);
	Tire frontRightTire = new Tire("앞오른쪽" , 2);
	Tire backLeftTire = new Tire("뒤왼쪽" , 4);
	Tire backtRightTire = new Tire("뒤오른쪽" , 7);
	
	int run() {
		if(frontLeftTire.roll()==false) {stop(); return 1;};
		if(frontRightTire.roll()==false) {stop(); return 2;};
		if(backLeftTire.roll()==false) {stop(); return 3;};
		if(backtRightTire.roll()==false) {stop(); return 4;};
		return 0;
		
	}
	
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
