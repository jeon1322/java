package day10.sub;

import day10.Test01;

public class Sample02 extends Test01 {
	public int no4 = 300;
	public Sample02() {
//		System.out.println("no1 : " +no1); //private 같은 클래스 내에서만 사용 가능
//		System.out.println("no2 : " +no2); //생략 같은 패키지가 아니면 사용불가
	System.out.println("no3 : " +no3); //public 어디든 사용가능
	System.out.println("no4 : " +no4); //protected 상속받은 클래스 내에서 사용가능
	
	}
	public Sample02(int no3) {
		no3 = 10;
//		System.out.println("no1 : " +no1); //private 같은 클래스 내에서만 사용 가능
//		System.out.println("no2 : " +no2); //생략 같은 패키지가 아니면 사용불가
	System.out.println("no3 : " +no3); //public 어디든 사용가능
	System.out.println("no4 : " +no4); //protected 상속받은 클래스 내에서 사용가능
	
	}
	
	@Override
	public void noPrint() {
		super.noPrint();
		System.out.println("#############################");
	}

	public static void main(String[] args) {
		new Sample02();
		Sample02 s1 = new Sample02(10);
		Test01 t1 = s1;
		System.out.println("t1.no4 : " + t1.no4);
		t1.noPrint();
	}
}