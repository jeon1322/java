package ex;
	/*
	 * 문제 1]
	 * 	1 ~ 25 의 숫자 3개를 랜덤하게 발생시켜
	 * 	그수들중 가장 큰 수, 중간 수, 작은수를 구분해서 출력하는 프로그램을 작성하시오.
	 */

public class Ex01_01 {
	public static void main(String[] args) {
	//랜덤 수 3개 발생
	int rnd1 = (int)(Math.random() * (25 - 1 + 1) + 1);
	int rnd2 = (int)(Math.random() * (25 - 1 + 1) + 1);
	int rnd3 = (int)(Math.random() * (25 - 1 + 1) + 1);
	//max mid min 3항연산자 
	int max = (rnd1 > rnd2) ? ((rnd1 > rnd3) ? rnd1: rnd3) : ((rnd2 > rnd3) ? rnd2 : rnd3);
	int mid = (rnd1 > rnd2) ? ((rnd1 > rnd3) ? ((rnd3 > rnd2) ? (rnd3):(rnd2)) : (rnd1)) : ((rnd1 > rnd3) ? (rnd1):((rnd2 > rnd3) ? rnd2 : rnd3));
	int min	= (rnd1 < rnd2) ? ((rnd1 < rnd3) ? rnd1 : rnd3) : ((rnd2 < rnd3) ? rnd2 : rnd3);
	//출력 
	System.out.println("rnd1 : " +rnd1+"\nrnd2 : "+rnd2+ "\nrnd3 : "+rnd3);
	System.out.println("Max 값 : " +max+ "\nMid 값 : " +mid+ "\nMin 값 : " +min);
	
 }
}
