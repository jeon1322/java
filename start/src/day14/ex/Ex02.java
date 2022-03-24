package day14.ex;
/*
	문제2]
		사각형의 정보를 기억하는 클래스 Nemo를 제작하세요
		필요한 변수와 함수, 생성자는 필요한 만큼 추가하고
		단, 가로와 세로가 동시에 같은 사각형만 같은 사각형으로
		처리가 되도록 equals() 함수를 오버라이드 하세요.
		이클래스 객체를 출력하면 내용이 출력되도록 toString() 를 오버라이드 하세요.
		
 */

public class Ex02 {

	public Ex02() {
		Nemo a1 = new Nemo(4, 5);
		Nemo a2 = new Nemo(5, 4);
		
		String result = (a1.equals(a2)) ? "같다" : "다르다.";
		System.out.println("첫번째 네모와 두번째 네모는 " +result);
		System.out.println("a1 : \n\t" +a1);
		System.out.println("a2 : \n\t" +a2);
		boolean bool = a1.equals(a2);
		
		System.out.println(bool);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
