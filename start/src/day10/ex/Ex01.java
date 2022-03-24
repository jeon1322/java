package day10.ex;
/*
	문제1]
		다음 변수를 가지는 Student 클래스를 제작하세요.
		
		String name;
		int ban, no, kor, eng, math;
		클래스를 만들고
		Ex01 클래스에서 
			 한명의 데이터를 입력해서 출력하기
			 5명의 데이터를 배열로 만들어 데이터 입력하고 출력하고...
			 
		1. 한개의 함수내에서 처리하기..
		2. 기능별로 분리해서 함수 만들어서 처리...
		
		보너스]
			int rank, total;
			double avg;
		
 */


public class Ex01 {
	private int ban;
	private int no, kor, eng, math;
	
public Ex01() {
	
	
}


	public int getBan() {
	return ban;
}


public void setBan(int ban) {
	this.ban = ban;
}


public int getNo() {
	return no;
}


public void setNo(int no) {
	this.no = no;
}


public int getKor() {
	return kor;
}


public void setKor(int kor) {
	this.kor = kor;
}


public int getEng() {
	return eng;
}


public void setEng(int eng) {
	this.eng = eng;
}


public int getMath() {
	return math;
}


public void setMath(int math) {
	this.math = math;
}


@Override
public String toString() {
	return "["+ban+ "반 " + no + "번 학생 국어 : " + kor + ", 영어 : " + eng + ", 수학 : " + math + "]";
}


}
