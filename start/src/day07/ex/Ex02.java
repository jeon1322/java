package day07.ex;
/*
 * 문제2]
 * 	int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
 * 	을 준비하고 
 * 
 * 	79456원을 coin에 기억된 화폐단위로 지불하려고 할때 각각의 단위 몇장씩 필요한지
 *  배열에 기억시켜서
 *  배열의 내용을 출력하세요.
 *  
 *  출력 예]
 *  	10000 : 7
 *  	5000 : 1
 *  	....
 *  	1	: 6
 */

public class Ex02 {

	public static void main(String[] args) {
		int[] coin = {10000, 5000, 1000, 500, 100, 50, 10, 1};
		int[] count = new int[coin.length];
		int money = 79456;
	loop:
		while(money != 0) {
		for(int i = 0; i < coin.length; i++) {
			if(money >= coin[i]) {
				money = money - coin[i];
				++count[i];
				continue loop;
			}
		}
			break;
		}
		System.out.println("79456원의 필요한 화폐단위는?");
		for(int i = 0; i < coin.length; i++) {
		System.out.println(coin[i]+"원 \t"+count[i]+"개 입니다.");
		}
	}

}
