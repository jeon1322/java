package day14;

public class Test03 {
	/*
	 	뭐 하고 있었니?
		늦었지만 잠시 나올래?
		너의 집 골목에 있는
		놀이터에 앉아 있어
		친구들 만나서
		오랜만에 술을 좀 했는데
		자꾸만 니 얼굴 떠올라
		무작정 달려왔어
		이 맘 모르겠니?
	 */

	public Test03() {
		//문자열의 변화가 심한 문자열 데이터는 String 타입보다는 
		//StringBuffer로 결합작업을 하는것이 유리하다.
		
		//1. StringBuffer 객체를 만들고
		StringBuffer buff = new StringBuffer();
		//2. 반복해서 결합작업을 하고
		buff.append("뭐 하고 있었니?\n");
		buff.append("늦었지만 '잠시 나올래?\n");
		buff.append("너의 집 '골목에 있는\n");
		buff.append("놀이터에' 앉아 있\n");
		buff.append("친구들 '만나서\n");
		buff.append("오랜만에 '술을 좀 했는데\n");
		buff.append("자꾸만 '니 얼굴 떠올라\n");
		buff.append("무작정' 달려왔어\n");
		buff.append("이 맘 모르겠니?\n");
		//3. 문자열로 변환이 필요한 순간에 변환해준다.
		String song = buff.toString();
		
		System.out.println(song);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
