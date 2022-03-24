package day07.ex;

import java.util.Arrays;

/*
 * 문제3]
 * 	반지름 5개를 기억하는 배열을 만들고
 *  랜덤하게 반지름을 만들어서 기억시키고
 *  각각의 원의 넓이를 계산해서 출력해주는 프로그램을 작성하시오.
 *  넓이도 배열에 기억 시켜주세요.
 *  
 *  
 */
public class Ex03 {

	public static void main(String[] args) {
		int[] radius = new int[5];
		double[] area = new double[radius.length];
		
		for(int i = 0; i < radius.length; i++) {
			radius[i] = (int)(Math.random() * 901 + 100);
			area[i] = (3.14f * radius[i] * radius[i]);
		}
		for(int i = 0; i < radius.length; i++) {
			System.out.println("반지름 : "+radius[i]+"\n넓이는 : "+area[i]+"\n");
		}
		

	}

}
