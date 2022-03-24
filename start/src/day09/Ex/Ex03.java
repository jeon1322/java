package day09.Ex;
/*
	문제3]
		사각형의 넓이를 계산하는 프로그램을 작성하세요.
		
		길이를 랜덤하게 만들어주는 함수
		넓이를 계산해주는 함수
		사각형의 내용을 출력해주는 함수
		
		
		
 */

public class Ex03 {
	int garo;
	
	public Ex03() {
		setGaro();
		int sero = setSero();
		setArea(garo, sero);
	}

	public static void main(String[] args) {
		new Ex03();

	}

	public void setGaro() {
		garo = (int)(Math.random() * 41 + 1);
	}
	public int setSero() {
		int sero = (int)(Math.random() * 41 + 1);
		return sero;
	}
	public void setArea(int no1, int no2) {
		int area = no1 * no2;
		System.out.printf(" 가로  : " +no1+ "\n 세로  : " +no2+ "\n넓이는 : " +area+" 입니다.");
	}
}
