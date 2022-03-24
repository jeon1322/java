package test_solo;

import java.io.FileOutputStream;

public class Test03 {

	public Test03() {
	}

	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day17/project/chatting.txt");
			System.out.println("성공");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
