package day11;

public class Test06 {
	public Test06(){
		Moyang[] no = new Moyang[10];
		
		for(int i = 0; i < 10; i++) {
			int soo = (int)(Math.random() * 3);
			int no1 =(int)(Math.random()* 21 + 5);
			int no2 = (int)(Math.random() * 21 + 5);
			
			if(soo == 0) {
				no[i] = new Circle01(no1);
			}else if(soo == 1) {
				no[i] = new Semo01(no1, no2);
			}else if(soo == 2) {
				no[i] = new Nemo01(no1, no2);
			}
		}
		//출력
		for(int i = 0; i < no.length; i++) {
			no[i].toPrint();
		}
	}

	public static void main(String[] args) {
		new Test06();

	}

}
