package day19;

public class Synch01 {
	int[] num = new int[5];
	
	public Synch01() {
		NumThread01 num1 = new NumThread01(this);
		NumThread02 num2 = new NumThread02(this);
		
		num1.start();
		num2.start();
	}

	public static void main(String[] args) {
		new Synch01();
	}

}

class NumThread01 extends Thread {
	Synch01 main;
	
	public NumThread01() {}
	public NumThread01(Synch01 main) {
		this.main = main;
	}
	
	@Override
	public void run() {
		/*
		 	이 스레드에서는 배열변수에 데이터를 기억하는 역할을 할 예정이다.
		 	이 스레드가 5개의 데이터를 완성할 때까지는 
		 	다른 스레드는 배열을 사용하지 못하게 하고 싶다.
		 	
		 */	
		System.out.println(" 이제 저장할 차례 ");
		synchronized (main.num) {
			for(int i = 0; i < 5; i++) {
				int no = (int)(Math.random() * 99 + 1);
				main.num[i] = no;
				System.out.println((i+1)+"번째 방에 ["+no+ "] 를 기억했습니다." );
				
				int sec = (int)(Math.random() * 1501 + 500);
				
				try {
					Thread.sleep(sec);
				} catch (Exception e) {
					
				}
			}
			System.out.println(" 저장 완료!! ");
		}
	}
}


class NumThread02 extends Thread {
	Synch01 main;
	
	public NumThread02() {}
	public NumThread02(Synch01 main) {
		this.main = main;
	}

	@Override
	public void run() {
		synchronized(main.num) {
			System.out.println("\t\t\t이제 사용할 차례... ");
			for(int i = 0; i < main.num.length; i++) {
				int no = main.num[i];
				System.out.println("\t\t\t" + no + "를 사용했습니다.");
				int sec = (int)(Math.random() * 1501 + 500);
				
				try {
					Thread.sleep(sec);
 				}catch (Exception e) {}
			}
		}
		
	}
}