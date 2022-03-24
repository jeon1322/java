package day11;

public class Circle01 extends Moyang{

	private int rad;
	private double arround, area;
	public Circle01() {}
	public Circle01(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	public void setArround() {
		arround = 2 * rad * 3.14;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setArea() {
		area = rad * rad * 3.14;
	}

	@Override
	public void toPrint() {
		System.out.printf("반지름이 %3d이고 둘레가 %6.2f이며 넓이가 %6.2f인 사각형\n", rad, arround, getArea());

	}
}
