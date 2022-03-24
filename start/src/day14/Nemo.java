package day14;

public class Nemo {
	private int width, height, area;
	public Nemo() {
		// 생성자가 함수를 하나도 정의하지 않으면
		// JVM이 이 클래스를 객체로 만드는 순간
		// 기본 생성자를 만들어서 사용하게 된다.
		// 만약 생성자를 하나라도 만들면 JVM은 기본 생성자를 만들지 않는다.
		// 따라서 생성자를 정의를 할 경우는 내용이 비어있는 기본 생성자도 정의하는 것이 좋다.
		
	}
	public Nemo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	public void setArea() {
		area = width * height;
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
	public int getArea() {
		return area;
	}
	
	@Override
	public String toString() {
		return "사각형 - 가로  : " +width+ " , 세로 : " +height+ " , 면적 : " +area;
	}
	/*
	 	면적이 같으면 같은 사각형이 되도록 처리해주는 함수
	 */
	
	@Override
	public boolean equals(Object o) {
		//반환값 변수
		boolean bool = false;
		
		// 입력된 데이터를 원래형태로 강제형변환 한다.
		Nemo nam = null;
		try {
			nam = (Nemo) o;
		} catch(Exception e) {
			return false;
		}
		
		int myunjuk = nam.getArea();
		
		bool = area == myunjuk;
		return bool;
	}
}
