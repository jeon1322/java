package test_solo;

import java.util.*;

import day17.make.Time;

public class Test01 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		String time = new String(new Time().setTime());
		String str = new String("안녕하세요.");
		map.put(1, time+str);
		
		System.out.println(map.get(1));
		
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		String str1;
		while(bool) {
		System.out.print(" 입력 : ");
		str1= sc.nextLine();
		if(str1.equals("Exit")) {
			System.out.println(" 멈췄습니다!!");
			bool = false;
			}
		}
		System.out.println("끝났습니다.");
	}

}
