package day12;

public class Dongl extends Figure {
	private int rad;
	private double area, arround;
	
	public Dongl() {}
	public Dongl(int rad) {
		this.rad = rad;
		setArea();
		setArround();
	}
	public void setArround() {
		arround = 2 * rad * Math.PI;
	}
	@Override
	public void setArea() {
		area = rad * rad * Math.PI;
		
	}
	@Override
	public void toPrint() {
		System.out.printf("이 원은 반지름이 %3d이고, 둘레가 %6.2f이고, 면적이 %6.2f 이다.\n", rad, area, arround);
	}
	
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getArround() {
		return arround;
	}
	public void setArround(double arround) {
		this.arround = arround;
	}
	

}
