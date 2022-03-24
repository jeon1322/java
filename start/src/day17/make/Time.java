package day17.make;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	public Time() {
		setTime();
	}
	
	
	public String setTime() {
		String str = "HH : mm";
		SimpleDateFormat format = new SimpleDateFormat(str);
		
		String time = format.format(new Date());
			return time;
		}
	}
