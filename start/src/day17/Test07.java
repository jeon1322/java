package day17;
/*
 	키보드를 입력해서 문자를 입력 받아보자.
 	
 */
import java.util.*;
import java.io.*;

public class Test07 {

	public Test07() {
		/*
		 	참고]
		 		키보드 역시 입력장치로 외부장치이다.
		 		자주 사용하는 외부장치이므로
		 		이미 스트림을 준비한 변수가 존재한다.
		 		
		 		System.in (변수)
		 */
		System.out.print("입력 해주세요 : ");
		int ch = 0;
		
		try {
		/*	
		 //	1. 한글자만 읽어보자 
		  	ch = System.in.read();
			System.out.println("입력한 문자는 : " +(char)ch);
			*/
	/*	//	2. 문장을 입력해서 읽어보자
			byte[]	buff = new byte[256];
			
			int len = System.in.read(buff);
			String str = new String(buff, 0, len);
			
			System.out.println(str); */
			
		//	3. 네트워크 처리할 때 많이 사용하는 방법
			byte[] buff = new byte[256];
			// 배열 기본값을  'A'로 채운다
			Arrays.fill(buff, (byte)'A');
			int len = System.in.read(buff, 10, 100);
			// 준비된 배열인 buff에 11번째 방부터 읽은 내용을 기억하세요..
			// 최대 100개까지만 읽어오세요..
			String str = new String(buff, 0, len + 10);
			
			System.out.println("입력한 내용 : " +str);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}
