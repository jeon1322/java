package day09.Ex;
/*
	문제1]
		문자열로 계산식을 입력하면
		식에 맞는 계산을 해서 출력해주는 프로그램을 작성하세요.
		
		단, 계산은 +, -, *, /, % 만 처리하기로 하고
		각 연산은 함수로 분리해서 처리하세요.
		
		입력, 출력, 계산을 모두 분리해서 함수로 만들어서 하세요.
 */

import java.util.Scanner;

public class Ex01 {
	public Ex01(){
		Scanner sc = new Scanner(System.in);
		String[] sik = input(sc);
		double result = calc(sik);
		
		System.out.println(sik[0] + " " +sik[1]+" " +sik[2] + "의 연산 결과 : " + result);
		
	}
	public static void main(String[] args) {
		new Ex01();

	}
	
	
	
	//입력함수
	public String[] input(Scanner s) {
		String[] str = new String[3];
		
		//메세지 출력후 계산식 입력 저장
		System.out.print("계산식 입력 : ");
		String sik = s.nextLine();
		for(int i = 0; i < sik.length(); i++) {
			char ch = sik.charAt(i);
			if(ch < '0' || ch > '9') {
				String sno1 = sik.substring(0, i);
				String sno2 = sik.substring(i+1);
				str[0] = sno1;
				str[2] = sno2;
				str[1] = ch + "";
				
				break;
			}
		}
		return str;
	}
	
	//계산해주는 함수 
	public double calc(String[] arr) {
		double result = 0;
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[2]);
		String giho = arr[1];
		
		switch(giho) {
		case "+":
			result = no1 + no2;
			break;
		case "-":
			result = no1 - no2;
			break;
		case "*":
			result = no1 * no2;
			break;
		case "/":
			result = no1 / (double)no2;
			break;
		}
		return result;
	}
}
