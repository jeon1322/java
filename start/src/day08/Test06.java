package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		String[] blackpink = new String[4];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < blackpink.length; i++) {
			System.out.print("멤머 입력 : ");
			blackpink[i] = sc.nextLine();
		}
		System.out.println(Arrays.toString(blackpink));
	}
}
