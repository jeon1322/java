package day09;
/*
	5학생의 3과목 점수를 배열에 입력한 후
	총점을 구하는 프로글매을 작성하세요.
	
	단, 점수입력, 계산, 출력은 함수로 처리하세요.
 */

public class Test04 {
	
	public Test04() {
		int[][] stud = new int[5][4];
		//점수 만들고
		setArr(stud);
		//총좀 구하고
		for(int i = 0; i < stud.length; i++) {
			setTotal(stud[i]);
		}
		//출력
		toPrint(stud);
		
	}

	public static void main(String[] args) {
		new Test04();

	}
	
	public void setArr(int[][] score) {
		for(int i = 0; i < score.length; i++) {
			
			for(int j = 0; j < score[i].length-1; j++) {
				score[i][j] = (int)(Math.random() * 41 + 60);
				
			}
		}
		// 이 함수의 경우는 입력된 주소의 내용을 변경하는 것이므로
		// 결국 배열을 반환해주지 않아도 된다.
	}
	
	//한 학생의 점수를 배열을 입력하면 총점을 계산해서 셋팅해주는 함수
	public void setTotal(int[] score) {
		int sum = 0;
		// 입력된 점수를 누적해서 더해준다.
		for(int i = 0; i < score.length-1; i++) {
			sum += score[i];
			
		}
		score[3] = sum;
	}
	
	//출력하는 함수
	public void toPrint(int[][] arr) {
		for(int i =0; i < arr.length; i++) {
			//한 학생의 점수를 뽑고
			System.out.print((char)('A' + i) + "학생 :");
			for(int j = 0; j < arr[i].length; j++) {
			//각 과목 점수 추출
				System.out.printf("%4d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}
