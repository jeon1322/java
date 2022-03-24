package day18;

public class Test15 {

	public Test15() {
		Jin j = new Jin();
		j.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println("\t\t 선생님이 졸고있습니다." +(i+1));
			
			try {
				j.sleep(200);
			} catch(Exception e) {
				
			}
		}
		j.setStart(false);
		
	}

	public static void main(String[] args) {
		new Test15();
	}
}

class Jin extends Thread {
	private boolean isStart = true;
	
	public boolean setStart(boolean isStart) {
		return this.isStart = isStart;
	}
	
	@Override
	public void run() {
		while(isStart) {
			System.out.println(" ###  Jin 복습한다.");
			try {
				Thread.sleep(200);
			} catch (Exception e) {}
		}
	}
}
