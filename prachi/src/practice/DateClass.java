package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		Date d=new Date ();
		System.out.println(d.toString());
SimpleDateFormat sd=new SimpleDateFormat("hh:mm:ss:ms");
System.out.println(sd.format(d));
	}

}
