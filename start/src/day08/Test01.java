package day08;
/*
 * 	 0 ~ 9 사이의 숫자를 100개 발생시켜서
 *   각각의 숫자가 몇번씩 발생하는지를 알아보자.
 *   
 *   방법]
 *   	각숫자의 횟수를 기억할 배열을 만들고
 *   	각 숫자가 발생할 때마다 1씩 누적 시켜준다.
 *   
 */

public class Test01 {

	public static void main(String[] args) {
		int no[] = new int[10];
		
		for(int i = 0; i < 100; i++) {
			int no1 = (int)(Math.random() * 10);
			no[no1] += 1;
		}
		for(int i = 0; i < no.length; i++) {
			int no1 = i;
			int count = no[i];
			
		}
		for(int i = 0; i < no.length; i++) {
			int count = no[i];
			System.out.print(i+" : ");
			for(int j = 0; j < count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
