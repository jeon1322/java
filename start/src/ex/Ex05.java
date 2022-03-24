package ex;
/*
 * 3자리 숫자 (100 ~ 999)를 입력 받아서
 * 이 숫자에 가장 가까운 100의 배수를 만들기 위해서는
 * 얼마나 필요한지를 계산해서 출력해주는 프로그램을 작성하세요.
 * 
 * 예]
 *  241은 200에 가까우므로 41을 빼야한다.
 *  777은 800에 가까우므로 23을 더해줘야한다.
 *  
 */

import java.util.Scanner;

public class Ex05 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("100 ~ 999중 3자리 수를 입력하시오. : ");
	 int su = sc.nextInt(); // 키보드로 받은 값 저장 (100 ~ 999)
	 System.out.println("입력 받은 값은 : " + su + " 입니다.");
	 int resul = su % 100; // 2자리 수만 남은 값
	 int value = (resul > 49) ? (100 - resul) : (resul - 0)  ; // 100
	 int mul = (resul > 49) ? (su + value) : (su - value);
	 System.out.println(+ su +"반올림 하여 나온 100의 배수는 " +mul+" 입니다.");
	 /* String sno = JOptionPane.showInputDialog(" 세자리 정수 입력 : "); //윈도우 창 띄워서 값 입력
	  * int no = Integer.parseInt(sno); // 문자열로 받은 데이터를 정수형으로 바꾸는 함수 
	  * 
	  * 
	  */
 }
}
				