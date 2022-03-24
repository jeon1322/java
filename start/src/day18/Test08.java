package day18;
import java.io.*;

public class Test08 {

	public Test08() {
		FileInputStream fin = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fin = new FileInputStream("src/day18/result/porm.txt");
			isr = new InputStreamReader(fin);
			br = new BufferedReader(isr);
			
			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				fin.close();
			} catch (Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
