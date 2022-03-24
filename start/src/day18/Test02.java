package day18;

import java.io.*;

public class Test02 {
	
	public Test02() {
		FileReader fr = null;
		
		try {
			fr = new FileReader("src/day18/result/porm.txt");
		/*	
			int ch = fr.read();
			System.out.println((char)ch);
			*/
		/*	char[] buff = new char[1024];
			int len = fr.read(buff);
			
			String str = new String(buff, 0, len);
			
			System.out.println(str);*/
			
			char[] buff = new char[1024];
			while(true) {
				int len = fr.read(buff);
				
				if(len == -1)break;
				
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			try {
				fr.close();
			} catch (Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test02();
	}

}
