package day18;

public class Test13 {

	public Test13() {
		Sky s = new Sky();
		Yh y = new Yh();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(y);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test13();
	}

}

class Sky implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100 ; i++) {
			System.out.println("하늘씨가 자바를 " + (i+1) + "번째 코딩합니다.");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {
				
			}
			
		}
	}
	
}

class Yh implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t용현씨가 " +(i+1) +"번째 복습을 합니다.");
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
	
}