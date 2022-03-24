package day17;

import java.io.FileInputStream;

public class Test02 {

	public Test02() {
		
		//파일로 연결된 스트림을 준비한다.
		FileInputStream fin = null;
				
		try {
			fin = new FileInputStream("src/day17/Test01.java"); //프로젝트 기준 주소
		/*	//int ch = fin.read();
			byte[] buff = new byte[10];
			int len = fin.read(buff);
			String str = new String(buff, 0, len);
			
			System.out.println("읽은 내용 : " + str);
			*/
			
		//	Teest01.java 파일을 읽어서 출력해보자.
			
			while(true) {
				byte[] buff = new byte[1024];
				//데이터를 읽습니다.
				int len = fin.read(buff);
				if(len == -1) break;
				String str = new String(buff, 0, len);
				System.out.print(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch(Exception e){}
		}
		
	}

	public static void main(String[] args) {
		new Test02();
	}

}
