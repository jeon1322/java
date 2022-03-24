package day11;

public class Semo01 extends Moyang{
	private int width, height;
	private double area;
	
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
		area = width * height / 2;
	}
	public Semo01() {}
	public Semo01(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	@Override
	public void toPrint() {
		System.out.printf("밑변이 %3d이고 높이가 %3d이며 넓이가 %6.2f인 삼각형\n", getWidth(), getHeight(), getArea());
	}
}
