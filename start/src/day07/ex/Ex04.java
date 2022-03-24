package day07.ex;
/*
 *  5명의 학생의 이름을 기억할 배열을 만들고
 *  각학생의 시험 성적을 기억할 배열을 만들고
 *  결과를 출력하는 프로그램을 작성하세요.
 *  
 *  성적은 랜덤으로 
 *  
 *  출력 예]	
 *  
 *  	둘리 : 80점
 *  	제니 : 90점
 *  	리사 : 85점
 *  	로제 : 75점
 *  	지수 : 100점
 * -----------------------------------
 * 		총점 : n
 * 		평균 : n.n
 *  
 */

public class Ex04 {

	public static void main(String[] args) {
		String[] name = {"둘리", "제니", "리사", "로제", "지수"};
		int[] score = new int[name.length];
		int sum=0;
		double avg;
		
		for(int i=0; i < name.length; i++) {
			score[i] = (int)(Math.random() * 41 + 60);
			sum += score[i];
		}
		for(int i = 0; i < name.length; i++) {
			System.out.println("\t"+name[i]+" : "+score[i]+"점");
		}
		System.out.println("--------------------------------");
		System.out.println("\t총점 : "+sum);
		avg = sum / (double)score.length;
		System.out.println("\t평균 : "+avg);
	}

}
