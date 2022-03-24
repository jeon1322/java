package day18;

import java.io.*;
public class Test06 {

	public Test06() {
		FileOutputStream fout = null;
		ObjectOutputStream oout = null;
		
		Friend jn = new Friend();
		jn.setName("제니");
		jn.setTel("010-1111-1111");
		jn.setMail("jennie@gitrd.com");
		jn.setAddr("YGM");
		jn.setBlood("AB");
		jn.setAge(27);
		jn.setHeight(165.5F);
		jn.setGen('F');
		jn.setRh(true);
		
		try {
			fout = new FileOutputStream("src/day18/result/jennie.txt");
			oout = new ObjectOutputStream(fout);
			
			oout.writeObject(jn);
			
			System.out.println(" 저장 성공 ");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test06();
	}

}
