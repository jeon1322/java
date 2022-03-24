package day12;

import java.util.Arrays;

public class Test00 {
	public Test00() {
		int no = 10;
		int[] arr = {1, 2, 3, 4, 5};
		
		no = addNo(no);
		setArr(arr);
		System.out.println("no : " + no);
		System.out.println("arr : " + Arrays.toString(arr));
	}
	
	public int addNo(int no) {
		int sum = no + 10;
		return sum;
	}
	public void setArr(int[] arr) {
		arr[0] = arr[0] + 10;
	}
	
	
	public static void main(String[] args) {
		new Test00();
	}

}
