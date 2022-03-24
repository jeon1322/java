package day18;

public class Test09 {

	public Test09() {
		MyThread01 sohyun = new MyThread01();
		MyThread02 seora = new MyThread02();
		
		sohyun.start();
		seora.start();
		System.out.println("===========생성사 쪽 종료 =============");
	}
	

	public static void main(String[] args) {
		new Test09();
		System.out.println("###########메인 종료 ##########");
	}
}

class MyThread01 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++	) {
			System.out.println("### 소연씨 코딩 !! "+ (i+1) +"회차");
		}
	}
}
class MyThread02 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++	) {
		System.out.println("@@@ 서라씨 코딩 !! "+ (i+1) +"회차");
		}
	}
}