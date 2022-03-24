package day11;

public class Test00_03 {
	Nemo[] sagak;
	public Test00_03() {
		setSagak();
		
		setRank();
		toPrint();
	}
	
	public void setSagak() {
		sagak = new Nemo[5];
		for(int i = 0; i < sagak.length; i++) {
			sagak[i] = new Nemo((int)(Math.random() * 21 + 5), (int)(Math.random() * 21 + 5));
		}
	}
	public void toPrint() {
		for(int i = 0; i < sagak.length; i++) {
			Nemo n = sagak[i];
			
			int garo = n.getGaro();
			int sero = n.getSero();
			int area = n.getArea();
			int rank = n.getRank();
			
			System.out.printf("이 사각형은 가로 %3d이고 세로가 %3d이고 넓이는 %4d이고 %3d번째로 큽니다.", garo, sero, area, rank);
			System.out.println();
		}
	}
	public void setRank() {
		for(int i = 0; i < sagak.length; i++) {
			Nemo n = sagak[i];
			
			int me = n.getArea();
			for(int j = 0; j < sagak.length; j++) {
				int you = sagak[j].getArea();
				int na = n.getRank();
				if(me < you) {
					n.setRank(na + 1);
					
				}
			}
		}
	}
	public static void main(String[] args) {
		new Test00_03();

	}

}
