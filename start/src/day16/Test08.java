package day16;

import java.util.*;
import java.io.*;
public class Test08 {

	public Test08() {
		Properties prop = new Properties();
		// 이 맵은 외부 파일과 연결할 예정이다.
		
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day16/data_ko.txt");
			/*
			 	여기 경로는 전체 절대 경롤를 사용해도된다.
			 	이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
			 	위 규칙을 따르면 된다.
			 	
			 	이제 이 파일의 내용을 Properties가 읽도록 한다.
			 */
			prop.load(fin);
			} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (Exception e) {
				
			}
		}
		// 위 작업이 완료가 되면 HashMap에 데이터가 저장된 것 처럼 사용하면 된다.
		String name = (String)prop.get("name");
		
		System.out.println("저장된 이름 : " +name);
	}

	public static void main(String[] args) {
		new Test08();
	}

}
