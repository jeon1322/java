package day18;

public class Test11 {

	public Test11() {
		NameThread t1 = new NameThread("리사");
		NameThread t2 = new NameThread();
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Test11();
	}

}

class NameThread extends Thread {
	/*
	 	하나의 프로그램을 이용해서 여러번 실행할 경우
	 	구분할 필요가 생길 수 있다.
	 	
	 	구분할 수 있는 방법은 여러가지가 있다.
	 	
	 		1. 변수 하나를 만들고 그 변수에 값을 다르게 입력해서 구분하는 방법
	 			String name;
	 		
	 		2. 스레드 프로그램 자체에 이름을 부여하는 방법
	 			이때는 상위 클래스인 Thread의 
	 				Thread(String name)
	 			를 이용하면 된다.
	 		
	 		
	 	
	 */
	
	public NameThread() {
		super("Jennie");
	}
	public NameThread(String name) {
		super(name);
	}
	@Override
	public void run() {
		
	for(int i = 0; i < 100; i++) {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println(name + " 가 " +(i+1) +"번째 노래를 합니다.");
	}
	}
}
