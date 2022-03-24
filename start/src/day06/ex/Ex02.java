package day06.ex;
/*
 * 문제 2]
 * 		두 사람이 등산을 한다.
 * 		한사람은 산 입구에서 0.54m/sec 의 속도로 등산을 시작하고
 * 		한사람은 정상에서 1.07m/sec 의 속도로 내려온다.
 * 		산의 높이가7564m 라고 가정하면
 * 		두 사람이 만나는 시점은 몇분 몇초 후인지 출력하세요. 
 */

public class Ex02 {
	public static void main(String[] args) {
		int moun = 7564, sec = 0;
		double up = 0;
		double down = 7564;
		for(;;) {
			up += 0.54;
			down -= 1.07;
			sec++;
			if(up >= down) {
				break;
			}
		}
		int minute;
		minute = sec / 60;
		sec %= 60;
		System.out.println("두 사람이 만나는 시점은 "+minute+"분 "+sec+"초 입니다.");
	}

}
