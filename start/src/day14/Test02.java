package day14;

public class Test02 {

	public Test02() {
		Nemo n1 = new Nemo(20, 10);
		Nemo n2 = new Nemo(10, 20);
		
		String result = (n1.equals(n2)) ? "같은" : "다른";
		System.out.println("n1 과 네모는 " +result+ " 네모입니다.");
		System.out.println("n1 : \n\t" + n1);
		System.out.println("n2 : \n\t" + n2);
		
	}

	public static void main(String[] args) {
		 new Test02();
	}

}
