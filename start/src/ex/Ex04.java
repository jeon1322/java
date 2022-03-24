package ex;
/*
 * 문제 4]
 *  1000 ~ 3000 사이의 숫자를 랜덤하게 발생시켜서 
 *  이 숫자를 년도로 하는 해는
 *  윤년인지 평년인지를 판별해서 출력해주는 
 *  프로그램을 작성하세요.
 *  
 *  참고]
 *   윤년은 4로 나누어 떨어지면 윤년 나머지는 평년
 *   100 나누어 떨어지면 안되고
 *   400으로 나누어 떨어지는 해가 윤년
 *   나머지는 평년
 *   
 */

public class Ex04 {
	public static void main(String[] args) {
		int year = (int)(Math.random() * (3000 - 2000 + 1) + 2000);
		boolean yundal = (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
		String A = yundal ? ("윤달") : ("평년");
		
		System.out.println(year+ "년은 "+A+ "입니다.");
	}

}
