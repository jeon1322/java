package day08;
/*
 * 얕은 복사 특징은 heap 영역에 있는 데이터는 프로그램이 종료할 때까지 살아남는다.
 */

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
		int[]  a;
		{
			int[] b = new int [5];
			b[2] = 500;
			
			System.out.println("b[2] : " + b[2]);
			a = b;
			
			a[2] = 1000;
			System.out.println("b[2] : " + b[2]);			
		}
		System.out.println(Arrays.toString(a));

	}

}
