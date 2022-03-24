package day18;

import java.io.*;

public class Test04 {

	public Test04() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src/day18/result/취중진담.txt");
			br = new BufferedReader(fr);
			
			char[] buff = new char[1024];
			
			while(true) {
				String line = br.readLine();
				if(line == null) break;
				System.out.println(line);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
