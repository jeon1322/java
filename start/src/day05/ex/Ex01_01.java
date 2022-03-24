package day05.ex;

/*
	1 부터 정수를 더해갔을때 그합이 5000을 초과하는 수는 몇부터인지 출력하세요.
	
	힌트 ]
		처음 합이 5000이 넘는 순간 반복문을 종료한다.
*/
public class Ex01_01 {

	public static void main(String[] args) {
		int no = 0, sum = 0;
		for(int i = 0; sum < 5000; i++){
			sum += (i+1);
			no = (i+1);
			
		}
		System.out.println("합이 5000이 넘어서 반복문 멈췄습니다. 합 : "+sum);
		System.out.println("이때 마지막 더한 값은 : " +no);
	}
}