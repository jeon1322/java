package day03;

public class Test06 {
	public static void main(String[] args) {
		String A = "정준영";
		String B = new String("정준영");
		
		System.out.println("문자열 비교 연산자");
		System.out.println("일반 비교문 "+ (A == B));
		System.out.println("일반 비교문 "+ (A.equals(B)));
		
		boolean bool1 = A == B;
		boolean bool2 = A.equals(B);
		
		System.out.println("A == B : " +bool1);
		System.out.println("A.equals(B) : " +bool2);
	}
}
