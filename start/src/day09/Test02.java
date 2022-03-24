package day09;

/*
	두 수를 이용해서 더하는 프로그램을 작성하세요.
	
	단, 입력, 계산, 출력을 함수로 만들어서 처리하세요.
		랜덤하게 숫자를 발생 시키는 것도 함수로 처리
 */

public class Test02 {
	public Test02() {
		//기본 생성자
		// 생성자함수는 반환값이 없다. 반환값 타입을 기술하지 않는다.
		abc();
		
		//함수는 저절로 실행되는 경우는 없다.
		//랜덤한 두 정수 만들고
		int no1 = makeInt();
		int no2 = makeInt();
		//두 수 계산하고
		int result = calc(no1, no2);
		
		//출력하고
		System.out.print("1번 정수 두개 입력 : ");
		toPrint(no1, no2);
		System.out.print("2번 정수 두개 입력 : ");
		toPrint(no1, no2, result);
	}

	public static void main(String[] args) {
		new Test02();

	}
	public void abc() {
		System.out.println("abc 함수 호출...");
		
	}
	
	public int makeInt() {
		int no = 0;
		
		no = (int)(Math.random() * 100 + 1);
		
		return no;
	}
	
	public int calc(int no1, int no2) {
		int result = 0;
		
		//이 함수를 실행할 때 입력된 두 정수는
		//no1, no2 변수에 기억될 것이다.
		//이 변수에 기억된 데이터를 계산하면 됨
		
		result = no1 + no2;
		
		return result;
	}
	// 두 수를 입력해주면 두 수의 계산결과를 출력해주는 함수
	public void toPrint(int no1, int no2) {
		int result = calc(no1, no2);
		System.out.println("두 정수 "+ no1+ " + " +no2+" : "+ result+" 입니다.");
		//return; 기술하지 않아도 실행 내용을 모두 실행하였으므로 함수가 자동 종료됨
	}
	
	// 두 수와 결과를 입력해주면 계산결과를 출력해주는 함수
	public void toPrint(int no1, int no2, int no3) {
		//참고] 매개변수리스트에 정의된 변수는 이 함수 블럭에서만 사용할 수 있는 지역변수입니다.
		
		System.out.println(" 두 정수 "+ no1 + " 과 " + no2 + " 의 합은 "+ no3 + "입니다.");
	}
}
