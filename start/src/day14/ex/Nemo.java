package day14.ex;

public class Nemo {
	private int width, height;
	private double area;
	
	public Nemo() {}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		toString();
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
	public void setArea(double area) {
		this.area = area;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		area = width * height;
	}
	
	@Override
	public String toString(){
		return "네모의 세로 : " +width+ " , 가로 : " +height+ " , 넓이 : " +area;
	}
	
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nam = null;
		try {
			nam = (Nemo) o;
		}catch(Exception e) {
			return false;
		}
		boolean bool2 = nam.height == height;
		
		bool = nam.width == width;
		bool = bool == bool2;
		
		return bool;
	}
}
