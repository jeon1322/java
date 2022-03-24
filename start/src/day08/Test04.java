package day08;

import java.util.Arrays;

/*
 * 정수 5개를 기억할 배열을 만들고
 * 데이터를 채워둔 후
 * 1번 방에서부터 3번방까지 데이터만
 * 다른 배열에 깊은 복사를 해보자.
 * 
 * 이때 복사될 배열은 길이를 10으로 하세요.
 * 
 * 
 */

public class Test04 {

	public static void main(String[] args) {
		int[] ori = {10, 20, 30, 40, 50};
		int[] copy = new int[10];
		
		System.arraycopy(ori, 0, copy, 0, 3); // 해석 ori[0]에서 3번째까지 복사해서 copy[0]에 붙여넣기 
		
		System.out.println("ori : " + Arrays.toString(ori));
		
		System.out.println("copy : " + Arrays.toString(copy));

	}

}
