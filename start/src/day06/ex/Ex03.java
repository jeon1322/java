package day06.ex;
/*
 * 문제 3]
 * 
 *  1 1 1 1 1
 *  2 2 2 2 2
 *  3 3 3 3 3
 *  4 4 4 4 4
 *  5 5 5 5 5  //1
 *  
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5
 *  1 2 3 4 5 //2
 *  
 *  1 2 3 4 5 
 *  2 3 4 5 6
 *  3 4 5 6 7
 *  4 5 6 7 8
 *  5 6 7 8 9 //3
 *  
 *   1  2  3  4  5
 *   6  7  8  9 10
 *  11 12 13 14 15
 *  16 17 18 19 20
 *  21 22 23 24 25  //4
 *  
 *  1
 *  1 2
 *  1 2 3
 *  1 2 3 4
 *  1 2 3 4 5 //5
 *  
 *   1
 *   2  3
 *   4  5  6 
 *   7  8  9  10
 *  11 12 13  14 15 //6
 *  
 */

public class Ex03 {

	public static void main(String[] args) {
		int no = 0;
	one: // 3_1
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((i+1)+"  ");
			}
				System.out.println();
		}//3_1
	System.out.println("================================");
	two: //3_2
		for(int i = 0; i < 5; i++) {
			no = 1;
			for(int j = 0; j < 5; j++) {
				System.out.print((no)+"  ");
				no++;
			}
				System.out.println();
		}//3_2
	
	
	System.out.println("================================");
	no = 1;
	three: //3_3  
		for(int i = 0; i < 5; i++) {
			no = i+1;
			for(int j = 0; j < 5; j++) {
				System.out.print((no)+"  ");
				no++;
			}
				System.out.println();
		}//3_3
	
	
	System.out.println("================================");
	no = 1;
	four: //3_4
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print((no)+"  ");
				no++;
			}
				System.out.println();
		}//3_4
	
	System.out.println("================================");
	no = 1;
	five: //3_5
		for(int i = 0; i < 5; i++) {
			no = 1;
			for(int j = 0; j < i+1; j++) {
				System.out.print((no)+"  ");
				no++;
			}
				System.out.println();
		}//3_5
	
	System.out.println("================================");
	no = 1;
	six: //3_6
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print((no)+"  ");
				no++;
			}
				System.out.println();
		}//3_6
		
		
	
	
	
	
	
	}

}
