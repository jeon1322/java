package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test03 {

	public Test03() {
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			//스트림을 만들고
			fin = new FileInputStream("src/day17/gorani.jpg");
			fout = new FileOutputStream("src/day17/result/goran_copy.jpg");
			
			while(true) {
				byte[]	 buff = new byte[1024];
				int len = fin.read(buff);
				if(len == 1) break;
				fout.write(buff, 0, len);
				System.out.println(" 파일 복사 성공 ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
			} catch (Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
