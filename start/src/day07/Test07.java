package day07;

/*
10 개의 정수를 랜덤하게 발생시켜서 기억하는 배열을 만들고
기억된 수중 가장 큰수를 알아내는 프로그램을 작성하세요.
*/
import java.util.Arrays;

public class Test07 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int max = 0;
	loop:
		for(int i=0; i < num.length; i++) {
			int no = (int)(Math.random() * 99 + 1);
			
			for(int j = 0; j < i; j++) {
				if(num[j] == no) {
					--i;
					continue loop;
				}
			}
			num[i] = no;
		}
			
			for(int i = 0; i < num.length; i++) {
				int tmp = num[i];
				if(max < tmp) {
					max = tmp;
				}
			}
			
			System.out.println(Arrays.toString(num));
			System.out.println("가장 큰수 : "+max);
	}

}
