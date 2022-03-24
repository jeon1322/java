package day17;
/*
 	Test09에서 저장한 dataoutput.txt 파일을 읽어보자.
 	
 */
import java.io.*;

public class Test10 {

	public Test10() {
		FileInputStream fin = null;
		DataInputStream din = null;
		
		try {
			fin = new FileInputStream ("src/day17/result/dataoutput.txt");
			din = new DataInputStream (fin);
			// 이름, 나이, 신장, 성별, 전화, 메일, 혈액형, rh순으로 꺼내와야한다.
			String name = din.readUTF();
			int age = din.readInt();
			float height = din.readFloat();
			char gen = din.readChar();
			String tel = din.readUTF();
			String mail = din.readUTF();
			char blood = din.readChar();
			boolean rh = din.readBoolean();
			
			System.out.println("이름 : " + name);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("혈액형 : " + blood);
			System.out.println("rh : " + (rh ? "+" : "-"));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				din.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
