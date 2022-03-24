package test_solo;
//메소드 
public class One {

	public static void main(String[] args) {
		Dog ro = new Dog();
	}

}

class Dog{

	Dog(){
		sound();
	}
	void sound() {
		System.out.append("멍멍");
	}
	
}