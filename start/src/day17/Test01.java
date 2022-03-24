package day17;

import java.io.*;

/*
	파일에 내용을 저장하는 프로그램을 만들어보자.
	
	
 */

public class Test01 {

	public Test01() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		
		FileOutputStream fout = null;
		// 경로가 잘못되면 파일을 만들 수 없으므로 예외처리가 필요하다.
		
		try {
			fout = new FileOutputStream("C:\\class\\java\\git\\start\\test\\src\\day17\\result\\Test01.txt");
//			fout = new FileOutputStream("src/day/result/FileTest01.txt");
			// 파일이 존재하지 않아도 자동으로 만들어준다.
			
		//	fout.write('j');
			String song = "Hey boy\r\nMake 'em whistle like a missile, bomb, bomb";
			byte[] buff = song.getBytes();
			fout.write(buff, 9, buff.length - 9); // buff.length - 9 : 내보낼 갯수, 9 : 시작 인덱스
			fout.write(buff); 
			System.out.println("파일 저장 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				// 외부장치와 연결된 경우는 해당 외부장치의 사용이 끝나면 닫아주는 것이 원칙이다.
				
			} catch (Exception e) {
				 
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
