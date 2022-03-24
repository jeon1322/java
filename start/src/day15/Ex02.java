package day15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {

	public Ex02() {
		String tel = "HP : 010-1234-56789";
		
		Pattern form = Pattern.compile("01[0-9]-\\d{3,4}-\\d{4}");
		
		Matcher mat = form.matcher(tel);
		
		if(mat.find()) {
			String hp = mat.group();
			System.out.println(hp);
			
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}

}
