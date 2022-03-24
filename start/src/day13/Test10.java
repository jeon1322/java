package day13;

public class Test10 {

	public Test10()  {
		Test1001 t01 = new Test1002();
		
		try{
			t01.abc();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test10();
	}

}
