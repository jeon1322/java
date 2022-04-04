package ping_;


import java.util.*;

public class PingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("*** 핑서버프로그램 ***\n서버시작 : start\n서버중단 : quit\n명령을 입력하세요.");
			String str = sc.nextLine();
			
			if(str.equals("start")) {
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(3);
					} catch(Exception e) {System.out.println("111");}
					break;
				}
				System.out.println("서버가 이미 실행 되었습니다.");
				break;
			}else if(str.equals("quit"))
				System.out.println("quit");
				ping.setStart(false);
				try {
					ping.allClose();
				} catch (Exception e) {}
				break loop;
			}
		}

	public static void main(String[] args) {
		new PingServer();
	}

}