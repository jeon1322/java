package day10;
/*
 	Black Pink 멤버의 정보를 기억할 배열을 만들고
 	데이터를 입력하고
 	완성이되면 내용을 출력하세요.
 	단, 각 멤버의 정보는 Friend 클래스에 기억시키도록 한다.
 	
 */

public class Test03 {
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] nage;
	char gen;
	String addrs;
		
	public Test03() {
		//멤버수들 초기화
		setData();
		//필요한 데이터들이 준비된 상태
		
		
		//각멤버를 배열 하나로 관리
		Friend[] black = getBlack();
		
		//내용 출력
	/*	for(Friend f : black) {
			System.out.println(f);
			//이렇게하면 Friend 클래스에 재정의한 toString() 함수가 자동 호출.
		}*/
		toPrint(black);
	}
	// Friend 배열 내용 출력해주는 함수
	public void toPrint(Friend[] black) {
		for(int i = 0; i < black.length; i++) {
		//System.out.println(black[i]);
			String name = black[i].getName();
			String addr = black[i].getAddr();
			String tel = black[i].getTel();
			String mail = black[i].getMail();
			String birth = black[i].getBirth();
			int age = black[i].getAge();
			char gen = black[i].getGen();
			
			System.out.println("이름 : " +name);
			System.out.println("주소 : " +addr);
			System.out.println("전화 : " +tel);
			System.out.println("메일 : " +mail);
			System.out.println("생일 : " +birth);
			System.out.println("나이 : " +age);
			System.out.println("성별 : " +(gen == 'M' ? "남" : "여"));
			System.out.println("========================================");
			
		}
	}
	//준비된 데이터를 Friend[] 타입의 데이터로 만들어서 반환해주는 함수
	public Friend[] getBlack() {
		//이 함수는 Friend[] 배열을 만들고
		Friend[] anne = new Friend[4]; //아직 각 방에 Friend 타입의 객체는 들어있지 않고 기억할 공간만 확보한 상태
		
		//각 방에 Friend 객체들을 채워넣는다.
		for(int i = 0; i < 4; i++) {
			anne[i] = new Friend();
		}
		//위 반복문이 종료가 되면 각 방에 있는 객체의 변수에 데이터를 입력할 수 있는 상태가 된다.
		// 데이터를 채워서
		for(int i =0; i < anne.length; i++) {
			Friend f = anne[i];
			String name = names[i];
			f.setName(name);
			
			f.setAddr(addrs);
			
			f.setTel(tels[i]);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
			
		}
		// 채원채의 배열을 반환해준다.
		return anne;
	}
	// 각 데이터를 초기화 시켜주는 함수
	public void setData() {
		names = new String[] {"제니", "리사", "로제", "지수"};
		tels = new String[] {"010-0011-1111","010-2222-2222","010-3333-3333","010-1234-1234"};
		email = new String[] {"jenni@github.com","Lisa@github.com","rose@github.com","jusoo@github.com"};
		birthday = new String[] {"1996/03/08","1996/04/05","1998/05/05","1997/07/07"};
		nage = new int[] {27, 28, 26, 27};
		gen = 'F';
		addrs = "ygM";
	
		
	}
	public static void main(String[] args) {
		new Test03();
	}

}
