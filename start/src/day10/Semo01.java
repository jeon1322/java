package day10;

public class Semo01 {
	private int height, width;
	private double area;
	
	public Semo01() {
		
		this(1, 1);
	}
	public Semo01(int height, int width) {
		this.height = height;
		this.width = width;
		setArea();
	}
	public void setArea() {
		area = width * height / 2;
	}
}
