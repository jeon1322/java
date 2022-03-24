package day03.ex;
 import java.util.*;
/*
 * 문제 1]
 * 	두개의 숫자를 입력받은 후(가로, 세로)
 *  그 숫자를 이용해서 사각형의 넓이와 삼각형의 넓이를
 *  구해서 출력하세요
 *  
 *  출력형식은
 *  	가로 : n
 *  	세로 : n
 *  	사각형 넓이 : n
 *  	삼각형 넓이 : n.n
 *  
 *  
 */

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 가로 : ");
		String garo = sc.nextLine();
		int width = Integer.parseInt(garo);
		System.out.println("입력된 가로 : " + width);
		System.out.print("입력할 세로 : ");
		String sero = sc.nextLine();
		int height = Integer.parseInt(sero);
		System.out.println("입력된 세로 : " + height);
		System.out.println(" 사각형 넓이는 : " + (width * height));
		System.out.println(" 사각형 넓이는 : " + ((width * height)/2.0));
		
		
		
		
		
		
		
		
	}

}
