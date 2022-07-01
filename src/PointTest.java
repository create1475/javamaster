class point {
	int x;
	int y;
	point(int x , int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x : " + x + " y : " + y;
	}
}

class Point3D extends point{
	int z ;
	Point3D (int x, int y , int z){
		super(x, y);
		this.z=z;
	}
	String getLocation () {
		return "x : " + x + " y : " + y + "z + " + z;
	}
}

public class PointTest {

	public static void main(String[] args) {
		
		Point3D po = new Point3D(1, 2, 3);
	System.out.println(po);
	
	
	}

}
