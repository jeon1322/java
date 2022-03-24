package day09.Ex;
/*
	문제 2]
		반지름 하나를 랜덤하게 랜덤하게 입력한 후
		원의 넓이
		원의 둘레
		를 계산해서
		출력하는 프로그램을 작성하세요
		
		반지름 랜덤하게 만들어주는 함수
		넓이 개선함수, 둘레 계산함수, 출력을 해주는 함수
		를 각각 만들어서 작성하세요.
		
 */

public class Ex02 {
	
	public Ex02() {
		int radius = setRadius();
		double area = setArea(radius);
		double round = setRound(radius);
		toPrint(radius, area, round);
	}
	
	public static void main(String[] args) {
		new Ex02();

	}
	
	public int setRadius() {
		int radius = (int)(Math.random() *(30 - 10 + 1 ) + 10);
		return radius;
	}
	
	public double setArea(int radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	
	public double setRound(int radius) {
		double round = radius * 3.14;
		return round;
	}
	
	public void toPrint(int radius, double area, double round) {
		System.out.println("반지름 : " + radius + "\n원의 넓이 : " + area + "\n원의 둘레 : " + round);
	}

}
