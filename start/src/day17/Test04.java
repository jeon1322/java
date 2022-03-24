package day17;

import java.io.File;

public class Test04 {

	public Test04() {
		
	//	File file = new File("src/day17/result/abc");
	//	String msg = file.mkdir() ? "폴더 생성 성공" : "폴더 생성 실패";
		
	/*	File file = new File("src/day17/result/a/b/c/d");
		String msg = file.mkdirs() ? "폴더 생성 성공" : "폴더 생성 실패";
		System.out.println(" 결과 : " +msg);*/
	/*	File file = new File("src/day17/result/a/b/c/d");
		String msg = file.delete() ? "삭제 성공" : "삭제 실패"	;
		System.out.println(" 결과 : " +msg); */
		
		File oldF = new File("src/day17/result/a/b/c");
		File newF = new File("src/day17/result/a/b/renameTest");
		
		String msg1 = oldF.renameTo(newF) ? "변경 성공" : "변경 실패";
		System.out.println(" 결과 : " + msg1);
		
	}
	

	public static void main(String[] args) {
		new Test04();
	}

}
