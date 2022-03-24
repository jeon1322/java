package day08;

public class Test08 {

	public static void main(String[] args) {
		String str = "Black Pink";
		
		String word1, word2;
		
		int idx1 = str.indexOf(' '); //문자열중 특정문자의 위차값 알려주는 함수
		word1 = str.substring(0, idx1);
		
		word2 = str.substring(str.indexOf('P'));
		
		System.out.println(word1);
		System.out.println(word2);
		

	}

}
