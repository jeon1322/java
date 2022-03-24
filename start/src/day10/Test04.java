package day10;

public class Test04 {
	//변수 선언
	String[] names;
	String[] tels;
	String[] email;
	String[] birthday;
	int[] nage;
	char gen;
	String addrs;
	
	Friend[] black;
		
	//생성자
	public Test04() {
		//데이터 변수들 셋팅하고
		setData();
		
		setBlack();
		
		toPrint();
	}
	
	public void setBlack() {
		//데이터 기억할 공간 확보하기
		black = new Friend[4];
		//확보된 공간에 데이터 채워주고
		for(int i = 0; i < black.length; i++) {
			black[i] = new Friend();
		}
		//각 방의 객체에 데이터 채워주고
		for(int i = 0; i < black.length; i++) {
			Friend f = black[i];
			
			f.setName(names[i]);
			f.setTel(tels[i]);
			f.setAddr(addrs);
			f.setMail(email[i]);
			f.setBirth(birthday[i]);
			f.setGen(gen);
			f.setAge(nage[i]);
		}
	}
	
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
		new Test04();
	}


public void toPrint() {
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
}