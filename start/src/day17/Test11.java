package day17;

/*
 	블랙핑크 휘파람을 파일에 저장해보자.
 	
 */
import java.io.*;

public class Test11 {

	public Test11() {
		PrintStream ps = null;
		
		try {
			ps = new PrintStream("src/day17/result/취중고백.txt");
			// 직접 파일에 연결된 스트림을 만드는 보조스트림이다.
			
			//내용을 써준다
ps.println("\t취중고백");
ps.println("\t\t멜로망스");
ps.println("뭐 하고 있었니?");
ps.println("늦었지만 잠시 나올래?");
ps.println("너의 집 골목에 있는");
ps.println("놀이터에 앉아 있어");
ps.println("친구들 만나서");
ps.println("오랜만에 술을 좀 했는데");
ps.println("자꾸만 니 얼굴 떠올라");
ps.println("무작정 달려왔어");
ps.println("이 맘 모르겠니?");
ps.println("요즘 난 미친 사람처럼 너만 생각해");
ps.println("대책 없이 네가 점점 좋아져");
ps.println("아냐 안 취했어, 진짜야");
ps.println("널 정말 사랑해");
ps.println("눈물이 날 만큼 원하고 있어");
ps.println("정말로 몰랐니?");
ps.println("가끔 전화해 장난치듯");
ps.println("주말엔 뭐할 거냐며");
ps.println("너의 관심 끌던 나를");
ps.println("그리고 한번씩");
ps.println("누나 주려 샀는데 너 그냥 준다고");
ps.println("생색낸 선물도");
ps.println("너 때문에 산 거야");
ps.println("이 맘 모르겠니?");
ps.println("요즘 난 미친 사람처럼 너만 생각해");
ps.println("대책없이 네가 점점 좋아져");
ps.println("아냐 안 취했어, 진짜야");
ps.println("널 정말 사랑해");
ps.println("진심이야, 믿어줘");
ps.println("갑자기 이런 말 놀랐다면 미안해");
ps.println("부담이 되는 게 당연해, 이해해 널");
ps.println("하지만 내 고백도 이해해 주겠니? Oh");
ps.println("지금 당장 대답하진 마");
ps.println("나와 일주일만 사귀어줄래?");
ps.println("후회 없이 잘해주고 싶은데");
ps.println("그 후에도 니가 싫다면");
ps.println("나 그때 포기할게");
ps.println("귀찮게 안 할게, 혼자 아플게 umm");
ps.println("진심이야, 너를 사랑하고 있어");
ps.flush();
System.out.println("취중진담 저장 성공 ");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
