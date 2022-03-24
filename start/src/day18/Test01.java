package day18;

import java.io.*;

public class Test01 {
	/*
		char 단위로 파일에 데이터를 저장하는 프로그램을 작성하세요.
		
	 */
	public Test01() {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("src/day18/result/취중진담.txt");
		/*	char ch = '취';
			fw.write(ch); */
			
			String str = "\t\t취중진담\r\t\t\t\t김민석";
		/*	char[] buff = str.toCharArray();
			fw.write(buff);
			*/
			fw.write(str);
			
			System.out.println(" 저장 성공 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
