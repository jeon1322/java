package day18;

public class Test14 {
	
	public Test14() {
		EndClass ec = new EndClass();
		
		ec.start();
		for(int i = 0; i < 10; i++) {
			System.out.println("메인 실행중...");
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				
			}
		}
		ec.stop();
	}

	public static void main(String[] args) {
		new Test14();
		System.out.println(" 프로그램 종료");
	}

}

class EndClass extends Thread {
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println("\t\t쓰레드 실행중");
			try {
				Thread.sleep(500);
			} catch(Exception e) {}
		}
	}
}