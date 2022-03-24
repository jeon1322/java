package day09.Ex;
/*
	문제4]
		1차원 배열의 정수 10개를 입력한 후
		합계와 평균을 구해주는 프로그램을 작성하세요.
		
		배열에 정수를 랜덤하게 채워주는 함수
		합계를 계산해주는 함수
		평균을 계산해주는 함수
		출력해주는 함수
 */

public class Ex04 {
	public Ex04() {
		int no[] = new int[10];
		setNo(no);
		
	}

	public static void main(String[] args) {
		new Ex04();

	}
	
	public int[] setNo(int[] no) {
		for(int i = 0; i < no.length; i++) {
			no[i] = (int)(Math.random() * (100 - 1 + 1) - 1);
		}
		return no;
	}

}
