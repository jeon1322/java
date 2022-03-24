package day14.ex;

public class Circle {
	//원의 반지름, 면적, 둘레
	private int  rad;
	private double area, round;
	
	public Circle() {}
	public Circle(int rad) {
		this.rad = rad;
		setArea();
		setRound();
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setRound(double round) {
		this.round = round;
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
	public void setArea() {
		area = 2 * rad * 3.14;
	}
	public double getRound() {
		return round;
	}
	public void setRound() {
		round = 3.14 * rad;
	}
	
	@Override
	public String toString() {
		return "원의 반지름 : " +rad+ " , 넓이 : " +area+ " , 둘레 : " +round;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Circle nam = null;
		try {
			nam = (Circle) o;
		}catch(Exception e) {
			return false;
		}
		int myRad = nam.getRad();
		
		bool = rad == myRad;
		
		return bool;
	}
}
