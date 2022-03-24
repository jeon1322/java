package day18;

public class Test12 {

	public Test12() {
		Jennie j = new Jennie();
		Lisa l = new Lisa();
		
		Thread t1 = new Thread(j);
		Thread t2 = new Thread(l);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test12(); 
		}
}

class Jennie extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("제니가 " +(i+1)+" 번째 노래를 합니다.");
		}
	}
}

class Lisa extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("\t\t\t리사가 " +(i+1)+" 번째 노래를 합니다.");
		}
	}
}