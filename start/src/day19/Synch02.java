package day19;
/*
	ArrayList 하나를 준비해서
	이곳에 데이터를 넣고 빼고를 할 예정
	즉, 
		1번 스레드는 이곳에 데이터를 입력할 예정이고
		2번 스레드는 이곳에서 데이터를 가지고 갈 예정이다.
		
	규칙
		5개의 데이터가 입력되면 더이상 입력하면 안된다.
		
 */
import java.util.*;
public class Synch02 {
ArrayList<Integer> list = new ArrayList<Integer>();
		
		synchronized void makeData (int num) {
			if(list.size() == 5) {
				try {
					System.out.println(" 채우는 작업 완료 ");
					wait();
				} catch (Exception e) {}
			}
			list.add(num);
			System.out.println(num + "을 채웠습니다.");
			System.out.println("<> 채운 후  데이터의 갯수는 "+list.size() + "개가 있습니다.");
			
			notify();
			// ==> 가장먼저 Block 상태로 들어간 스레드가 일을하게 된다.
		}
		synchronized void useData() {
			if(list.size() == 0) {
				try {
					System.out.println("\t\t데이터를 꺼내는작업 잠시 멈춤...");
				} catch(Exception e) {}
				
			}
			int no = list.get(0);
			list.remove(0);
			System.out.println("\t\t" +no+ " 를 꺼냈습니다.");
			System.out.println("\t\t남아있는 데이터의 갯수는 " +list.size()+"개 남았습니다.");
		//	이제 데이터를 추가할 수 있는 공간이 추가 되었으니
		//	다시 데이터를 채우는 작업을 깨우러간다.
			notify();
		}
	public Synch02() {
		DataThread01 t1 = new DataThread01(this);
		DataThread02 t2 = new DataThread02(this);
		
		t1.start();
		t2.start();
	}

	public static void main(String[] args) {
		new Synch02();
	}
}
class DataThread01 extends Thread {
	Synch02 main;
	public DataThread01() {}
	public DataThread01(Synch02 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			int no = (int)(Math.random() * 99+1);
			main.makeData(no);
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			}catch (Exception e) {}
		}
	}
}

class DataThread02 extends Thread {
	Synch02 main;
	public DataThread02() {}
	public DataThread02(Synch02 main) {
		this.main = main;
	}
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			int no = (int)(Math.random() * 99+1);
			main.useData();
			int sec = (int)(Math.random()*1501 + 500);
			try {
				Thread.sleep(sec);
			}catch (Exception e) {}
		}
	}
}
