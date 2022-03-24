package day05.ex;

/*
문제 14 ]
	다음 조건을 만족하는 숫자를 찾는 프로그램을 작성하세요.
	
	1. 4자리 숫자 abcd는 0이 들어있지 않고, 모두 다른 숫자이다.
	2. 첫번째 숫자(a)가 마지막 숫자(d)보다 2 큼
	3. 두번째 숫자(b)가 세번째 숫자(c)보다 크다.
	4. 4자리 숫자를 역순으로 하고 그 수와 4자리수를 합하면 16456이 된다.
		a	b	c	d
		
	+	d	c	b	a
	
	====> 16456 
		
*/
public class Ex14 {

	public static void main(String[] args) {
		int result = 0;
		int a=0, b=0, c=0, d=0;
	loop:
		for(a = 3; a <= 9; a++) {
			d = a - 2;
			for(b = 2; b < 10; b++) {
				if(b == a && b == d) {
					continue;
				}
				for(c = 1; c < 8; c++) {
					if(c >= b) {
						break;
					}
					if(c == a || c == d) {
						continue;
					}
					int no1 = a * 1000 + b * 100 + c * 10 + d;
					int no2 = d * 1000 + c * 100 + b * 10 + a;
					
					if(no1 + no2 == 16456) {
						result = no1;
						break loop;
					}
					
				}
			}
		}
		System.out.println("찾는 번호는 "+result+" 입니다.");
	}
}
