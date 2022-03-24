package day16;

/*
 	Set계열의 특징
 		1. 입력순서 보장하지 않는다. <== 자기나름의 정렬규칙을 가지고 정렬해서 보관한다.
 		2. 중복데이터 입력을 허락하지 않는다.
 		3. 
 */

import java.util.*;
public class Test01 {
	/*
	 	Neomo 클래스를 만들고 가로가 같은 네모면 같은 네모로 처리해라
	 */

	public Test01() {
		Nemo nemo1 = new Nemo(5, 3);
		Nemo nemo2 = new Nemo(5, 3);
		
		HashSet set = new HashSet();
		
		set.add(nemo1);
		set.add(nemo2);
		
		for(Object o : new ArrayList(set)) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}
