package test_solo;

public class OutClass {
	int outerData = 1;
	MemberClass inc;

	public OutClass() {
		inc = new MemberClass();
		printData("내부 클래스에서 변경된 외부 클래스의 멤버확인", outerData);
		printData("외부 클래스에서 변경된 내부 클래스의 멤버 참조", inc.innerData);
	}
	void printData(String str, int value) {
		System.out.println(str + " | " +value);
	}
	
class MemberClass{
	int innerData = 2;
	
	MemberClass(){
		printData("내부 클래스의 생성자에서 외부 클래스의 멤버 참조", innerData);
		outerData = 3;
	}
}

	public static void main(String[] args) {
		System.out.println("==> Outer에서 Inner 변수 참조 <==");
		new OutClass();
		System.out.println();
	}

}
