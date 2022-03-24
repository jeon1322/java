package day07;

import java.util.Arrays;

public class Test04 {
	/*
	 *  5과목의 점수를 기억할 배열을 만들고
	 *  과목 점수를 입력해서
	 *  총점과 평균을 구하고
	 *  출력하세요.
	 *  배열에 담긴 점수도 출력하세요.
	 */

	public static void main(String[] args) {
		//
		int[] subj = new int[5];
		
		//과목 점수를 랜덤
		for(int i=0; i < subj.length; i++) {
			subj[i] = (int)(Math.random() * (100 - 60 + 1) + 60);
		}
		int total = 0;
		for(int i = 0; i < subj.length; i++) {
			total += subj[i];
		}
		double avg = total / (double)subj.length;
		
		System.out.println("총점 : "+total+"\t평균 : "+avg+"\t 과목 점수 : "+Arrays.toString(subj));
	}

}
