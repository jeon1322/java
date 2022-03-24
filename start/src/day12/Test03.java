package day12;

public class Test03 {
	public Test03() {
		for(int i = 0; i < 5; i++) {

			Object o = getData();
			int result = 0;
			if(o instanceof Integer) {
				result = ((Integer)o) + (i * 10); // wrapper 클래스에서 기본형 타입으로 형변환 : unboxxing
													// 반대는 Boxxing	
			}else if(o instanceof String) {
				String str = (String) o;
				result = Integer.parseInt(str) + (i * 10);
			}
			System.out.println((i + 1) + "번째 결과 " + result);
		}
		
	}

	public static void main(String[] args) {
		new Test03();
		
		
	}
	
	public Object getData() {
		
		int no = (int)(Math.random() * 2);
		
		Object obj = null;
		
		if(no == 0) {
			obj = 100;
		} else if(no == 1) {
			obj = "100";
		}
		return obj;
	}

}
