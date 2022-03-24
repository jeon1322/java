package day03.ex;
/*
 * 84232원을 지불할려고 한다.
 * 우니라 화폐단위별로 이 금액을 지불하려면 
 * 각 단위가 몇개씩 필요한지 계산하세요.
 * 
 * 화폐단위 
 * 5만원권
 * 1만원권
 * 5천원권
 * 1천원권
 * 5백원권
 * 1백원권
 * 5십원권
 * 1십원권
 * 1원권
 */
public class Ex03 {
	public static void main(String[] args) {
		int omanwon = 50000, manwon = 10000, ochenwon = 5000, chenwon = 1000,
			obakwon = 500, bakwon = 100, osibwon = 50, sibwon =10, won = 1;
		int money = 84232;
		
		System.out.println("84232을 지불하기 위해 필요한 화폐 단위를 알려주시오.");
		System.out.println("5만원권 : 1장 남은 금액은 : " +((money = (money - omanwon))));
		System.out.println("1만원권 : 3장 남은 금액은 : " +((money = (money - (manwon*3)))));
		System.out.println("5천원권 : 0장 남은 금액은 : " +((money = (money - (ochenwon*0)))));
		System.out.println("1천원권 : 4장 남은 금액은 : " +((money = (money - (chenwon*4)))));
		System.out.println("5백원권 : 0개 남은 금액은 : " +((money = (money - (obakwon*0)))));
		System.out.println("1백원권 : 2개 남은 금액은 : " +((money = (money - (bakwon*2)))));
		System.out.println("5십원권 : 0개 남은 금액은 : " +((money = (money - (osibwon*0)))));
		System.out.println("1십원권 : 3개 남은 금액은 : " +((money = (money - (sibwon*3)))));
		System.out.println("1원권   : 2개 남은 금액은 : " +((money = (money - (won*2)))));
		System.out.println("=========================================================================");
		
		int total = 84232;
		int tmp = total;
		
		int oman = tmp / 50000;
		tmp = tmp % 50000;
		
		int man = tmp / 10000;
		tmp = tmp % 10000;
		
		int ochun = tmp / 5000;
		tmp = tmp % 5000;
		
		int chun = tmp / 1000;
		tmp = tmp % 1000;
		
		int obeak = tmp / 500;
		tmp = tmp % 500;
		
		int beak = tmp / 100;
		tmp = tmp % 100;
		
		int oship = tmp / 50;
		tmp = tmp % 50;
		
		int ship = tmp / 10;
		tmp = tmp % 10;
		
		int il = tmp % 10;
		
		System.out.println("총금액 " + total + "원은");
		System.out.println("오만원권 " + oman + " 장");
		System.out.println("오만원권 " + man + " 장");
		System.out.println("오만원권 " + ochun + " 장");
		System.out.println("오만원권 " + chun + " 장");
		System.out.println("오만원권 " + obeak + " 장");
		System.out.println("오만원권 " + beak + " 장");
		System.out.println("오만원권 " + oship + " 장");
		System.out.println("오만원권 " + ship+ " 장");
		System.out.println("오만원권 " + il + " 장");
		
		
		
		
	}
}
