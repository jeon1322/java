package day08;

public class Test02 {

	public static void main(String[] args) {
		int[] score = new int[5];
		int[] stud = new int[5];
		
		for(int i = 0; i < stud.length; i++) {
			stud[i] = 1;
		}
		for(int i = 0; i < score.length; i++) {
			int no = (int)(Math.random() * 41 + 60);
			
			score[i] = no;
		for(int j = 0; j < score.length; j++) {
			if(score[j] > score[i]) {
				stud[i] = stud[i] + 1;
			}
		}
		}
		for(int i = 0; i < stud.length; i++) {
			String man = (char)('A' + i) + "";
			
			int num = score[i];
			int rank = stud[i];
			
			System.out.println(man+ "학생 ] "+ num + "점 - " +rank+ "등");
		}
	}

}
