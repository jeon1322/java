package day09;

public class Test05 {
	public Test05() {
		int no1 = getInt();
		int no2 = getInt(1, 10);
		int result = add(no1, no2);
		toPrint(no1, no2, result);
		
	}

	public static void main(String[] args) {
		new Test05();
	}
	
	public int getInt() {
		int no = (int)(Math.random() * 10 + 1);
		return no;
	}

	public int getInt(int pos1, int pos2) {
		int min = pos1 < pos2 ? pos1 : pos2;
		int max = pos1 < pos2 ? pos2 : pos1;
		int no = (int)(Math.random() *(max - min +1) - min);
		
		return no;
	}
	
	public int add(int no1, int no2) {
		return (no1 + no2);
	}
	
	public void toPrint(int no1, int no2, int result) {
		System.out.println("두 수 " +no1+ " + " +no2+" 의 합은 : " +result);
	}
	public void toPrint(int no1, int no2) {
		System.out.println("두 수 " +no1+ " + " +no2+" 의 합은 : " +add(no1, no2)+" 입니다.");
	}
}
