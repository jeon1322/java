package day11;
/*
 	사각형의 정보를 기억할 Nemo를 정의하고
 	필요한 데이터를 입력해서 가로, 세로가 객체가 되는 순간 입력이 되도록 하고
 	그 클래스의 객체를 5개 관리할 배열을 만들고
 	배열이 완성되면 출력하세요.
 	
 */

public class Test00 {
	
	public Test00() {
		Nemo[] sagak = new Nemo[5];
		for(int i = 0; i < sagak.length; i++) {
			int garo = (int)(Math.random() * 21 + 5);
			int sero = (int)(Math.random() * 21 + 5);
			
			Nemo n = new Nemo(garo, sero);
			sagak[i] = n;
		}
		for(int i = 0; i < sagak.length; i++) {
			Nemo n = sagak[i];
			
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			
			System.out.printf("이 사각형은 가로 %3d이고 세로가 %3d이고 넓이는 %4d 입니다.", garo, sero, area);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Test00();

	}
	
	

}
