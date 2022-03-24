package day03.ex;
import java.util.Scanner;
/*
 * 문제 2] 숫자를 입력받은 후 (원의 반지름)
 * 그 숫자를 이용해서 원의 넓이와 둘레를 계산하고 출력하세요.
 * 
 * 참고]
 * 원의 넓이 : 반지름 * 반지름 * 3.14
 * 원의 둘레 : 2 * 반지름 * 3.14
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름를 입력하세요 : ");
		String ra = sc.nextLine();
		Double radius = Double.parseDouble(ra);
		double pi = 3.14;
		double area = radius*radius*pi;
		double arround = 2 * radius * pi;
		System.out.println("원의 넓이는 : " + area);
		System.out.println("원의 둘레는 : " + arround);
		int intArea = (int)area;
		int intDulae = (int)arround;
		System.out.println(intArea);
		System.out.println(intDulae);
		
	}

}
