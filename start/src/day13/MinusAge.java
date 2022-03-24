package day13;

public class MinusAge extends Exception	{
	
	@Override
	public String toString() {
		return getClass().getName()+ " : 음수의 나이가 입력되었습니다.";
	}
}
