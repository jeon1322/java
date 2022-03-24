package day11;

public class Nemo01 extends Moyang{
	private int width, height;
	private double area;
	
	public Nemo01() {
		
	}
	public Nemo01(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public void toPrint() {
		System.out.printf("밑변이 %3d이고 높이가 %3d이며 넓이가 %6.2f인 사각형\n", getWidth(), getHeight(), getArea());

	}
	
}
