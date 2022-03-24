package ex;
/*
 * 문제 1]
 *  1 ~ 25의 숫자 3개를 랜덤하게 발생시켜서
 *  그 수들중 가장 큰 수만 출력하는 프로그램을 작성하세요.
 *  단, 3항 연산자를 사용해서 처리하세요.
 */
public class Ex01 {
	public static void main(String[] args) {
		//할일
		// 랜덤하게 3개 수를 발생
		int rnd1 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int rnd2 = (int)(Math.random() * (25 - 1 + 1) + 1);
		int rnd3 = (int)(Math.random() * (25 - 1 + 1) + 1);
		//보너스문제 : -100 ~ 100 사의 정수를 랜덤하게 발생하시켜보기
		//int rnd4 = (int)(Math.random() * (-100 - 100 + 1) + 1);
		
		
		// 큰 수를 비교해서 변수에 담기 3항 연산자 사용
		int max = ((rnd1 > rnd2) ? ((rnd1 > rnd3) ? rnd1 : rnd3) : ((rnd2 > rnd3) ? rnd2 : rnd3));
		int min = ((rnd1 < rnd2) ? ((rnd1 < rnd3) ? rnd1 : rnd3) : ((rnd2 > rnd3) ? rnd2 : rnd3)); 
		
		// 큰 수 저장된 변수 출력 
		System.out.println("첫번째 숫자 : " +rnd1);
		System.out.println("두번째 숫자 : " +rnd2);
		System.out.println("세번째 숫자 : " +rnd3);
		System.out.println("가장 큰수는 " +max+ " 입니다.");
		System.out.println("가장 작은는 " +min+ " 입니다.");
		//System.out.println(rnd4);
	}
}
