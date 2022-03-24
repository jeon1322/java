package day05.ex;
/*
   문제 9 ]
		1 - 2 + 3 - 4 + 5 - 6 .... 했을 경우
		어디까지 계산하면 그 결과가 100을 넘기게 되는지 출력하세요.
 */

public class Ex09 {
	public static void main(String[] args) {
		int sum = 0, in = 0;
		for(int i = 0; sum < 100; ++i) {
			sum = sum - i; ++i;
			sum = sum + i;
			in = i;
		}
		System.out.println(in+"만큼 증가하여 멈췄다.");
	}
}

