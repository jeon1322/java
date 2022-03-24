package day03.ex;

/*
 * 1년은 365.2426일 입니다.
 * 이것은 과연 몇일 몇시간 몇분 몇초인지를 계산하고 출력
 * 
 * 힌트]
 * 365.2426일은 단위가 일 단위입니다.
 * 하루는 24시간입니다
 * 따라서 0.5일은 12시간을 의미한다.
 * 
 */

public class Ex04 {
	public static void main(String[] args) {
		System.out.println("365.2426일은 몇일, 몇시, 몇분, 몇초인지 계산하고 출력");
		
		double year = 365.2426, tmp = year;
		
		int day = (int)tmp;
		tmp = tmp - day;
		int tsec = (int)(0.2426 * 24 * 60 * 60);
		// 시간 구하고 --> 누적 변수에 계산해서 업데이트
		int hour = tsec / 60 / 60;
		tsec = tsec % (60*60);
		// 분 구하고 --> 누적 변수에 계산해서 업데이트
		int min = tsec / 60;
		tsec = tsec % 60;
		int sec = tsec;
		
		System.out.println("1년은 " +year+"입니다 이걸 일시분초로인지 계산하시고 출력하시오");		
		System.out.println("일은 : " +day+ "일 입니다");
		System.out.println("시는 : " +hour+ "시간 입니다");
		System.out.println("분은 : " +min+ "분 입니다.");
		System.out.println("분은 : " +sec+ "초 입니다.");
		/*System.out.println("분은 : " +seconds+ "초 입니다.");
		*/
		
		
	}

}
