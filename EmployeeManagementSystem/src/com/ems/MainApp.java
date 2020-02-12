package com.ems;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainApp {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		for(String a : dateFormatting(date))
			System.out.println(a);
	}

	public static String[] dateFormatting(Date d) {
		SimpleDateFormat formatter = new SimpleDateFormat("E dd MMM yyyy HH:mm:ss");
		String str = formatter.format(d);
		
		String[] date =	str.split(" ");
		
		return date;
	}
}
