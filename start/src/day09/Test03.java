package day09;
/*

	5개의 숫자를 배열로 입력받아 더하는 프로그램을 작성하세요.
	
	단, 입력, 계산, 출력은 함수로 처리하세요.
	
 */




public class Test03 {
	
	public Test03() {
		// 정수 배열 받아오기
		int[] no = getArr();
		toPrint(no);
		
	}
	
	public static void main(String[] args) {
		new Test03();
		
	}
	
	public int[] getArr() {
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 99 + 1);
		}
		
		return arr;
	}
	
	public int addAll(int[] arr) {
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	public void toPrint(int[] num) {
		System.out.print("입력된 배열 : ");
		
		for(int n : num) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		System.out.print("배열의  총합 : ");
		//System.out.print(addAll(num));
		int total = addAll(num);
		System.out.print(total);
	}
	// 함수가 실행되면 5개의 정수를 관리하는 배열을 완성해서 반환시켜주는 함수
}
