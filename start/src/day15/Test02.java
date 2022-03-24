package day15;

import java.util.Random;

public class Test02 {

	public Test02() {
		Random rd = new Random();
		
		System.out.println(rd.nextInt());
		
		Random rd1 = new Random();
		for(int i = 0; i < 10; i++) {
			int no = rd1.nextInt(100);
			
			System.out.println(no);
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
