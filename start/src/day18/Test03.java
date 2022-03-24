package day18;

import java.io.*;
public class Test03 {

	public Test03() {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("src/day18/result/gorani.jpg");
			fw = new FileWriter("src/day18/result/gorani_copy.jpg");
			
			char[] buff = new char[1024];
			while (true) {
				int len = fr.read(buff);
				if(len == -1) break;
				fw.write(buff, 0, len);
			}	
			System.out.println(" 저장 성공 ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
