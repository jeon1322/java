package day05.ex;
/*
문제 10 ]
	주사위 2개를 던질 경우 눈의 합이 6이 되는 경우를 모두 출력하세요.
*/
public class Ex10 {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 6; j++) {
				if(i + j == 6) {
					count++;
				}
			}
		}
		System.out.println("두 자사위를 던질 경우 눈 합이 6이 되는 경우의 수는 "+(count*2)+"  입니다.");
	}

}
