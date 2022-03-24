package day17;

import java.io.*;
import java.util.*;

public class Test06 {

	public Test06() {
		/*
		 	우리가 이제까지 키보드로 입력을 받을 때 사용했던 클래스는
		 	Scanner 클래스 였는데...
		 	이 클래스의 생성방법은...
		 	
		 		Scanner(InputStream.in)
		 		==> Scanner(System.in)
		 		
		 		Scanner(File file)
		 */
		// Scanner를 이용해서 day17/result/Test01.txt 파일을 읽어보자.
		
		File file = new File("src/day17/result/Test01.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			
			
			//한행을 읽어서 출력하는 함수
			String str = sc.nextLine();
			/*
			 	한 단어만 읽어서 출력하는 함수
			 	String str = sc.next();
			 */
			
			System.out.println(str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
