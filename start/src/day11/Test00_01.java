package day11;

public class Test00_01 {
	
	
	public Test00_01() {
		Nemo[] sagak = new Nemo[5];
		// 만들어진 배열에 사각형 채워주는 함수 호출
		setArr(sagak);
		toPrint(sagak);
	}
	
	// 사각형 채워주는 함수
	public void  setArr(Nemo[] sagak) {
		for(int i = 0; i < sagak.length; i++) {
			//sagak[i] = new Nemo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
			int garo = (int)(Math.random() * 21 + 5);
			int sero = (int)(Math.random() * 21 + 5);
			
			Nemo n = new Nemo(garo, sero);
			sagak[i] = n;
		}
	}
	public void toPrint(Nemo[] sagak) {
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
		new Test00_01();

	}
	

}
