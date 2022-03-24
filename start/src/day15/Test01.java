package day15;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test01 {

	public Test01() {
		String url = "http://wwwblackpink.org/member/?fd=asf&jkas=ljkl";
		
		int idx = url.indexOf('?');
		String param = url.substring(idx + 1);
		
		System.out.println(param);
		
		StringTokenizer token = new StringTokenizer(param, "&");
		
		int cnt = token.countTokens();
		
		String[] tmp = new String[cnt];
		
	/*	int i = 0;
	
		while(token.hasMoreTokens()) {
			tmp[i++] = token.nextToken();
		}
		*/
		for(int i = 0; token.hasMoreTokens()/* i < cnt*/; i++) {
			tmp[i] = token.nextToken();
		}
		
		System.out.println(Arrays.toString(tmp));
		String[][] data = new String[cnt][2];
		
		for(int i =0; i < tmp.length; i++) {
			String str = tmp[i];
			StringTokenizer tk = new StringTokenizer(str, "=");
			
			data[i][0] = tk.nextToken();
			data[i][1] = tk.nextToken();
		}
		for(String[] arr : data) {
		/*	for(String s : arr) {
				System.out.print(s + " : ");
			}
			System.out.println();
			*/
			System.out.println(arr[0] + " : " + arr[1]);
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
