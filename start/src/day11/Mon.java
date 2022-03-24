package day11;

public class Mon {
 public int rad;
 public double arround, area;
 public static final double PI = 3.14;
 	public Mon() {
 		
 	}
 	public Mon(int rad) {
 		this.rad = rad;
 		
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
		arround = 2 * rad * Mon.PI;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		area = rad * rad * Mon.PI;
	}
}
