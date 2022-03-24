package day18;

import java.io.*;

public class Test05 {

	public Test05() {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fr = new FileReader("src/day18/result/porm.txt");
			br = new BufferedReader(fr);
		/*	fw = new FileWriter("src/day18/result/porm_copy.txt");
			bw = new BufferedWriter(fw); */
			pw = new PrintWriter("src/day18/result/porm_copy1.txt");
			while(true) {
				String str = br.readLine();
				if(str == null) break;
			/*	bw.write(str+"\r\n");
				bw.flush(); */
				
				pw.println(str);
				pw.flush();
			}
			System.out.println(" 복사성공 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
