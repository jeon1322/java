package day11;

public class Test02 {
	public Test02() {
		for(int i = 0; i <5; i++) {
		Mon c1 = new Mon((int)(Math.random() * 21 + 5));
		
		int rad = c1.getRad();
		double arround = rad * 2 * Mon.PI;
		double area = rad * rad * Mon.PI;
		
		c1.setArea(area);
		c1.setArround(arround);
		System.out.printf("반지름 %3d이고 둘레 %6.2f 넓이 %8.2f\n", rad, arround, area);
	}
	}

	public static void main(String[] args) {
		new Test02(); 
	}
	
}
