package day06.ex;
/*
 * 문제 4]
 * 
 * 		다음 형태로 출력하세요
 * 
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *    * * * * * 
 *    
 *    * * * * *
 *    * * * *
 *    * * * 
 *    * *
 *    *
 *    
 *            *
 *          * *
 *        * * *
 *      * * * *
 *    * * * * * 
 *
 *    
 */

public class Ex04 {

	public static void main(String[] args) {
		int no = 0;
		one: // 4_1
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print("*  ");
				}
					System.out.println();
			} //4_1
		System.out.println("================================");
		two: // 4_2
			no = 5;
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < no; j++) {
					System.out.print("*  ");
					
				}
					no--;
					System.out.println();
			} //4_2
			
			
		System.out.println("================================");	
		three: //4-3
			for(int i = 0; i < 5; i++) {
				for(int j = 4; j > i; j--) {
					System.out.print("   ");
					}
					for(int k = 0; k < i+1; k++) {
						System.out.print("*  ");
					}
				System.out.println();
			} //4-3
			
		
		
			

	}

}
