package day12;

public class Test02 {
	public Test02() {
		Abc a = new Abc();
		Efg e = new Efg();
		
		toPrint(a);
		toPrint(e);
	}
	public static void main(String[] args) {
		new Test02();
	}
	public void toPrint(Abc a) {
		a.abc();
	}

}

 class Abc{
	 public void abc() {
		 System.out.println("########### 나는 Afg.abc() #############");

	 }
 }
 
 class Efg extends Abc{
	 public void abc() {
		 System.out.println("************* 나는 Efg.abc() ************");
	 }
 }
