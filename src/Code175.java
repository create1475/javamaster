interface WithPrivate{
	default int getData() {
	print();
	return get() + 100;
}

	private void print() {
	System.out.println(get());
	}	
	private int get() {
	return 100;
	}
}
class Text4 implements WithPrivate{
	void test() {
		int x = getData();
		System.out.println("x:" + x);
	}
}

public class Code175 {

	public static void main(String[] args) {
		Text4 t = new Text4();
		t.test
		();
	}

}
