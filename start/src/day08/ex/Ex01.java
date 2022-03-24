package day08.ex;
/*
	문제2]
		7학생의 5과목 점수를 랜덤하게 만들어서 기억시키고
		각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
		결과를 출력하는데
		평균도 계산해서 출력하세요.
		
	
 */
	
public class Ex01 {

	public static void main(String[] args) {
		int[][] stud = new int[7][6];
		int total = 0;
		double avg = 0.0;
		
		for(int i = 0; i < stud.length; i++) {
			total = 0;
			for(int j = 0; j < stud[i].length-1; j++) {
				int score = (int)(Math.random() * 41 + 60);
				total += stud[i][j] = score;
			}
			stud[i][stud[i].length-1] = total;
			
		}
		
		for(int i = 0; i < stud.length; i++) {
			System.out.print((i+1)+"번째 학생의 점수 | ");
			for(int j = 0; j < stud[i].length-1; j++) {
				System.out.print(stud[i][j]+" | ");
				total = stud[i][stud[i].length-1];
				avg = (double)total / (stud[i].length - 1);
			}
			System.out.println("입니다. 총점은 : "+total+" 평균 : "+avg);
		}
	
	}
}
