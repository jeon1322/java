package day16;

public class Nemo {
	private int widht, height;
	private double area;
	
	public Nemo(int widht, int height) {
		this.widht = widht;
		this.height = height;
		setArea(widht * height);
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
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

	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		Nemo nemo =(Nemo) o;
		
		bool = widht == nemo.getWidht();
		
		
		return bool;
	}
	
	@Override
	public String toString() {
		return String.format("이 사각형은 가로가 %3d, 세로가 %3d, 면적이 %6.2f 입니다.", widht, height, area);
	}
	@Override
	
	public int hashCode() {
		return 1; // 이 클래스의 객체는 이제부터 모두 해쉬코드값을 1을 갖는다.
		
	}
}
