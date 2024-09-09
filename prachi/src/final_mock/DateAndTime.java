package final_mock;

import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
