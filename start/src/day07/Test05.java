package day07;
/*
 *  5과목의 점수를 기억할 배열을 만들고
 *  과목 점수를 입력하고 
 *  총점도 배열의 마지막에 계산해서 입력하고
 *  총점과 평균을 구하고
 *  출력하세요.
 *  배열에 담긴 과목점수도 출력하세요.
 */

import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		int[] subj = new int[6]; //마지막 방은 총점 값 저장 하므로 1~5번째 방만 계산
		for(int i = 0; i < subj.length-1; i++) {
			subj[i] = (int)(Math.random() * (100 - 60 + 1) + 60 );
		}
		System.out.println("1. " + Arrays.toString(subj));
		for(int i = 0; i < subj.length - 1; i++	) {
			subj[subj.length - 1] += subj[i];
		}
		System.out.println("2. " + Arrays.toString(subj));
		
		int no = subj.length - 1;
		double avg = subj[5] / (double) no;
		
		System.out.print("과목 점수 : ");
		for(int i = 0; i < subj.length-1; i++) {
		System.out.print(subj[i]+ " | ");
		}
		System.out.println();
		System.out.println("총     점 :	" +subj[subj.length - 1]);
		System.out.println("평     균 : " + avg);
	}

}
