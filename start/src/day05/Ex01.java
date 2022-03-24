package day05;
/*
 * 1 ~ 10 까지의 합을 구해서 출력해주는 프로그램을 작성하세요
 * 
 */

public class Ex01 {
	public static void main(String[] args) {
		int hap = 0;
		for(int i = 0; i < 11; i++) {
			hap += i;
		}
		System.out.println("1 ~ 10까지의 합은 : " +hap );
	}
}