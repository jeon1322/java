package day10.ex;

public class Student {
	private int ban;
	private int[] no, kor, eng, math;
	
	public Student() {
		setData();
		Ex01[] student = getStudent();
		for(Ex01 f : student) {
			System.out.println(f);
		}
	}

	public static void main(String[] args) {
		new Student();
		}
	
	public void setData() {
		ban = 1;
		no = new int[5];
		kor = new int[5];
		eng = new int[5];
		math = new int[5];
		
		for(int i = 0; i < 5; i++) {
			no[i] = i+1;
			kor[i] = (int)(Math.random() * 41 + 60);
			eng[i] = (int)(Math.random() * 41 + 60);
			math[i] = (int)(Math.random() * 41 + 60);
		}
	}
	public Ex01[] getStudent() {
		Ex01[] score = new Ex01[5];
		for(int i = 0; i < score.length; i++) {
			score[i] = new Ex01();
		}
		for(int i = 0; i < score.length; i++) {
			Ex01 s =  score[i];
			s.setBan(ban);
			s.setNo(no[i]);
			s.setKor(kor[i]);
			s.setEng(eng[i]);
			s.setMath(math[i]);
		}
		return score;
	}
}
