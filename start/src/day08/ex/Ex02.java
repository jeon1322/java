package day08.ex;
/*
	
	문제2]
		Ex01에서 만든 배열의 내용을
		다섯과목의 7학생의 배열로 바꿔서
		해결하세요.
		
	보너스]
		Ex01의 각학생의 항목에 석차도 입력되도록 하세요.
		내림차순 정렬하세요.
		
 */

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		int[][] stud = new int[6][7];
		int sum;
		
		for(int i = 0; i < stud.length-1; i++) {
			for(int j = 0; j < stud[0].length; j++) {
				stud[i][j] = (int)(Math.random() * 41 + 60);
			}
		}
		for(int i = 0; i < stud[0].length; i++) {
			System.out.print("학생"+(i+1)+"\t");
		}
		System.out.println(); // 학생들 보여주고 줄 바꿈 
		
		for(int i = 0; i < stud.length-1; i++) {
			for(int j = 0; j < stud[0].length; j++) {
				System.out.print(stud[i][j]+"\t");
				
			}
			System.out.println(); // 과목 점수 발생후 줄바꿈 * 5과목 
		}
		System.out.println("_____________________________________________________________");
		
		for(int i = 0; i < stud[0].length; i++) {
			sum = 0;
			for(int j = 0; j < stud.length-1; j++) {
			 sum = sum + stud[j][i];
			}
			stud[5][i] = sum;
			System.out.print(stud[5][i]+"\t");
		}	// 학생들의 합계를 배열에 저장후 출력
		
		
		System.out.println();
		for(int i = 0; i < stud[0].length; i++) {
			int count = 0;
			for(int j = 0; j < stud[0].length; j++) {
				if(stud[5][i] <= stud[5][j]) {
					count++;
				}
			}
			System.out.print(count+"\t");
		} //학생 등수 출력
		
	}
}
