package day05;

import java.util.Scanner;

/*
 * 나이를 입력 받아서
 * 		유년층
 *  	10대
 *  	20대
 *  	30대
 *  	40대
 *  	장년층
 *  으로 구분해서 출력하세요.
 */

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하시오. : ");
		int age = sc.nextInt();
		String sage = "장년층";
		int gen = age / 10 * 10;
		switch(gen) {
		case 0:
			sage = "유년기";
			break;
		case 10:
			sage ="10대";
			break;
		case 20:
			sage ="20대";
			break;
		case 30:
			sage ="30대";
			break;
		case 40:
			sage ="40";
			break;
		default:
			sage ="장년층";
			
		}
		System.out.println("입력한 나이 : "+age+ "는 " +sage+" 입니다.");
		
		
		
	}
}
