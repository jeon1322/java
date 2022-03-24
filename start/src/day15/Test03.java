package day15;
/*
 	이름을 입력받아서
 	입력한 이름이 한글이름이지를 검사하는 프로그램을 작성하세요.
 	이름 글자수를 2글자에서 5글자까지만 허용
 	
 */
import java.util.*;
import java.util.regex.*;


public class Test03 {

	public Test03() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		//정규식 검사를 한다.
		
		//패턴을 정의하고 
		Pattern form = Pattern.compile("[가-힣]{2,5}");
		//패턴에 맞는지 검사한다.
		Matcher mat = form.matcher(name);
		boolean bool = mat.matches();
		String result = bool ? "올바른" : "잘못된";
		
		System.out.println("입력받은 이름 ["+ name+"] 은 " +result+ " 이름입니다.");
	}

	public static void main(String[] args) {
		new Test03();
	}

}
