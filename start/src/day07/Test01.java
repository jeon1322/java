package day07;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		/*
		 *  정수 6개를 관리할 배열 arr 을 만들고
		 * 	1 ~ 6까지 채워서
		 * 한개씩 꺼내서 출력하세요.
		 * 
		 * 
		 *  배열변수 선언
		 *  
		 *  배열 변수의 선언 형식
		 *  	데이터타입[] 변수;
		 */
		
		int[] arr;
		//배열변수 초기화
		arr = new int[6];
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			System.out.println(arr[i]);
			/* Heap에 만들어지는 기본데이터타입 변수들은 모두
				자동 초기화가 된다.
				boolean : false;
				char : 아스키코드값 0
				byte : 0
				short : 0
				int : 0
				long : 0
				float : 0.0f
				double : 0.0
				
				
			 */
			
		}
		//블랙핑크 멤버의 이름을 기억할 배열을 만들어서 출력하세요.
		//블랙핑크는 4명으로 구성되어있습니다.
		//제니, 리사, 로제, 지수
		String[] blackpink = new String[4];
		for(int i = 0; i < blackpink.length; i++) {
			System.out.println(blackpink[i]);
		}
		
		//멤버 추가
		blackpink[0] = "제니";
		blackpink[1] = "리사";
		blackpink[2] = "로제";
		blackpink[3] = "지수";
		
		System.out.println(blackpink); //해시코드
		
		System.out.println(Arrays.toString(blackpink)); //내용 확인
		
		//출력 
		for(int i = 0; i < blackpink.length; i++) {
			/*
			 * 참고] 여러개의 데이터를 관리하는 데이터타입들은
			 * 		 데이터 한개를 꺼냈을 때의 그 데이터의 타입을 먼저 생각해봐야 한다.
			 * 
			 */
			String name = blackpink[i]; //배열에 있는 데이터타입으로 저장해서 
			
			System.out.println(name); //출력
		}
		//배열은 한번 만들어지면 크기와 타입을 수정할 수 없다.
		//데이터의 갯수가 수정이 필요시 배열을 다시 설계한다.
		
		String tmp[] = new String[5];
		for(int i = 0; i < 4; i++) {
			tmp[i] = blackpink[i];
		}
		tmp[4] = "둘리";
		
		blackpink = tmp;
		
		// 하나씩 꺼내서 출력
		// 배열과 같은 데이터는 향상된 for문(forEath)이 편합니다.
		for(String name : blackpink) {
			//의미 blackpink의 데이터를 하나씩 꺼내서 name 변수에 저장
			System.out.print(name+", ");
		}

	}

}
