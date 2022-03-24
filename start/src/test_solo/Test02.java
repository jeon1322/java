package test_solo;

public class Test02 {

	public Test02() {
		Sub no = new Sub();
		System.out.println("super클래스에 있는 sum함수 값 : " +no.sum());
		System.out.println("sub클래스에서 있는 sub함수 값 :	" +no.sub());
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}

class Super{
	int x, y;
	public Super() {}
	public Super(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int sum() {
		return (x + y);
	}
	
}

class Sub extends Super{
	public Sub() {
		super(30, 20);
	}
	
	public int sub() {
		return (x - y);
	}
}
