package day14;

import java.util.*;

public class Test04 {
	

	public Test04() {
		StringBuffer buff = new StringBuffer();
		buff.append("뭐 하고 있었니?\n");
		buff.append("늦었지만 '잠시 나올래?\n");
		buff.append("너의 집 '골목에 있는\n");
		buff.append("놀이터에' 앉아 있\n");
		buff.append("친구들 '만나서\n");
		buff.append("오랜만에 '술을 좀 했는데\n");
		buff.append("자꾸만 '니 얼굴 떠올라\n");
		buff.append("무작정' 달려왔어\n");
		buff.append("이 맘 모르겠니?\n");
		
		String song = buff.toString();
		
		StringTokenizer to = new StringTokenizer(song, "\n");
		
		int len = to.countTokens();
		
		String[] norae = new String[len];
		
		//하나씩 꺼내서 배열에 담아준다.
		for(int i = 0; to.hasMoreTokens(); i++	) {
			String tmp = to.nextToken();
			norae[i] = tmp;
		}
		for(String n : norae) {
			System.out.println(n+" | ");
		}
	}

	public static void main(String[] args) {
		new Test04();
	}

}
