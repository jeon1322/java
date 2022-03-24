package day05.ex;
/*
	문제2]
	'A' 부터 문자를 10개를 만들어서 출력하세요. 
*/

public class Ex02 {
	public static void main(String[] args) {
		char ch = 'A';
		for(int i = 0; i < 10; i++) {
		System.out.println((i+1)+ "번째"+((char) (ch + i)));
		}
	}

}
