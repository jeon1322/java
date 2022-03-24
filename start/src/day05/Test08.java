package day05;
	/*
	 * 1부터 6까지를 기억하는 배열의 데이터를
	 * 꺼내서 출력하세요.
	 * 
	 * 참고]
	 * 		배열 
	 * 			타입이 같은 데이터를 일정갯수만큼 모아서 하나로 관리하도록 만들어 놓은
	 * 			자바의 데이터 타입
	 * 
	 *		타입이 결정이 되어야 하고,
	 *		갯수도 결정이 되어야 만들 수 있다.
	 *
	 *		단점
	 *			한번 사이즈(갯수)가 결정이 되면
	 *			사이즈(갯수) 수정이 안된다.
	 *	데이터타입[] 변수명 = new 데이터타입[데이터갯수];
	 *  데이터타입[] 변수명 = {데이터1, 데이터2, 데이터3, ....};
	 *  
	 * 배열의 위치값을 index라고 부름
	 */

public class Test08 {
	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6}; // 1~6을 관리하는 정수배열
		// 배열 길이 알아내기
		int len = num.length;
		for(int i = 0; i < len; i++) {
			System.out.println((i+1)+"번째 " +num[i]+ "입니다.");		
		}
		//향상된 for문
		for(int no : num) {
			System.out.println("### " +no);
		}

		
	}
}
