package day18;

public class Test10 {

	public Test10() {
		Yuna y = new Yuna();
		Euns e = new Euns();
		
		Thread t1 = new Thread(y);
		Thread t2 = new Thread(e);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test10();
	}

}

class Yuna implements Runnable {

	@Override
	public void run() {
		quest();
	}
	public void quest() {
		for(int i = 0; i < 100; i++) {
			System.out.println("*** 유나씨가 " +(i+1) +"번째 질문을 합니다.");
		}
	}
}

class Euns implements Runnable {

	@Override
	public void run() {
		answer();
	}
	public void answer() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\t### 선생님이 " +(i+1)+"번째 대답을 합니다.");
		}
	}
}