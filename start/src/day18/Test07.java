package day18;

import java.io.*;

/*
 	Test06 에서 저장한 jennie.txt 파일을 읽어보자
 	
 	ObjectOutputStream 으로 저장한(내보낸) 파일은
 	반드시 ObjectInputStream으로 읽어야 한다.
 	
 	
 */
public class Test07 {

	public Test07() {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day18/result/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			Friend jny = (Friend)oin.readObject();
			String name = jny.getName();
			String tel = jny.getTel();
			String mail = jny.getMail();
			String addr = jny.getAddr();
			String blood = jny.getBlood();
			int age = jny.getAge();
			float height = jny.getHeight();
			char gen = jny.getGen();
			boolean rh = jny.isRh();
			
			System.out.println("이름 : " + name + " , tel : " +tel+ " , mail : " +mail+ " , 주소 : " +addr+ " , 혈액형 : " +blood+ " , 나이 : " +age+
					" , 신장 : " + height + " , 성별 : " +gen+ " , Rh : " +rh);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oin.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}

}
