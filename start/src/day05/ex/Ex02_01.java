package day05.ex;

/*
	Ex02_01 ]
		3 ~ 10 사이의 정수를 랜덤하게 발생시켜서
		그 정수를 길이로 하는 영어 단어를 랜덤하게 만드세요.
		단, 시작문자는 대문자로 하고 나머지는 소문자로 하세요.
 */

public class Ex02_01 {

	public static void main(String[] args) {
		/*int no = (int)(Math.random() * (10 - 3 + 1) + 3);
		char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'i', 'j', 'k'};
		System.out.println(no);
		for(int i = 0; i < no; i++) {
			if(i == 0) {
				char ch = str[i];
				System.out.print((char)(ch+('A'-'a')));
				++i;
				}
			System.out.print(str[i]);
			}
			
			* 내가 만든거
			*/
		for(int i = 0; i < 10; i++) {  //선생님 tip 주신거
		char ch = (char)(Math.random() * ('z' - 'a' + 1) + 'a');
		if(i == 0) {
		System.out.print((char)(ch+('A'-'a')) + " ");
		}
		System.out.print(ch+" ");
		}
		
	}

}
