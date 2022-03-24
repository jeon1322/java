package day12;
/*
 	랜덤하게 3 ~ 5 정수를 발생시키고
 	3이 나오면 삼각형
 	4가 나오면 사각형
 	5가 나오면 원
 	의 형태로 10개를 만드세요.
 */

public class Study01 {
	private Figure[] fig;
	
	public Study01() {
		setFig();
		figPrint();
	}
	
	public void figPrint() {
		for(Figure f : fig) {
			f.toPrint();
		}
	}
	
	public void setFig() {
		fig = new Figure[10];
		
		for(int i = 0; i < 10; i++) {
			int no = getRndNo();
		
			switch(no){
				case 3:
					fig[i] = new Semo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5));
					break;
				case 4:
					fig[i] = new Nemo((int)(Math.random() * 21 + 5),(int)(Math.random() * 21 + 5));
					break;
				case 5:
					fig[i] = new Dongl((int)(Math.random() * 21 + 5));
					break;
			}
		}
	}

	public int getRndNo() {
		return (int)(Math.random() * 3 + 3);
	}
	public static void main(String[] args) {
		new Study01();

	}

}
