package day17.make;
/*
	dya17/project/chatting.txt를 구성해서
	txt 파일에 채팅기록을 남겨보기 
 */
import java.io.*;
import java.util.*;

public class Project01 {
	String time;
	Vector vec = new Vector();
	public Project01() {
		time = new String(new Time().setTime()); // 시간을 String해서 받아오고
		// 폴더 만들고 파일 만들기	
		setFold(); //성공적으로 실행됨
		// 폴더 안에 txt파일 만들기
		setFile(); //
		
		//Scanner로 무한 채팅
		setChat();
		
		// txt파일에 데이터 입력하기
		setChar();
		
	}
	public void setFold() {
		File file = new File("src/day17/project");
		String msg = file.mkdir() ? "폴더 생성 성공" : "폴더 생성 실패";
		System.out.println(msg);
	}
	
	
	public void setFile() {
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day17/project/chatting.txt");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setChat() {
		// Vector로 만드는게 더 좋을듯..
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("채팅 : ");
			String chat = sc.nextLine();
			vec.add("["+time+"]"+chat+"\r");
			if(chat.equals("exit")) break;
			count++;
		}
		System.out.println("채팅 프로그램을 종료합니다. ");
	}
	
	public void setChar() { //입력해주기 
		FileWriter fw = null;
			try {
				fw = new FileWriter("src/day17/project/chatting.txt");
				
				for(Object o : vec) {
					String str = (String)o;
					fw.write(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fw.close();
				} catch(Exception e) {
					
				}
			}
		}	
	
	

	public static void main(String[] args) {
		new Project01();
	}

}
