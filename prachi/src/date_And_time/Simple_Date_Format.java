package date_And_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple_Date_Format {

	public static void main(String[] args) {
		//to day month date year and time
		Date d=new Date();
		System.out.println(d.toString());
		
		//to  get date
		SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(s.format(d));
		
		//to get date and time
		SimpleDateFormat s2=new SimpleDateFormat("dd/MM/yy hh.mm.ss");
		System.out.println(s2.format(d));
		
		
		
		System.out.println("----------Practice_-----------");
		Date d1=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sd.format(d));
		SimpleDateFormat sd1=new SimpleDateFormat("hh:mm:ss");
		System.out.println(sd1.format(d));
	}

}
