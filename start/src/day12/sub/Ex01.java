package day12.sub;

/*
	랜덤하게 3 ~ 5 정수를 발생시켜서
		3 이 나오면 삼각형
		4 가 나오면 사각형
		5 가 나오면 원
	의 형태로 10개의 도형을 만들어서 
	하나의 변수로 관리하고
	각 도형의 내용을 출력하세요.
 */
public class Ex01 {
	private Figure[] arr;
	public Ex01() {
		setArr();
		toPrint();
	}
	public void toPrint() {
		for(Figure f : arr) {
			f.toPrint();
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
	
	public int setRandom() {
		return (int)((Math.random() * 3 + 3));
	}
	
	public void setArr() {
		arr = new Figure[10];
		for(int i = 0; i < 10; i++) {
			int no = setRandom();
		}
	}
}