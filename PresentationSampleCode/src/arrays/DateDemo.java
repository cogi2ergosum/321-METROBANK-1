package arrays;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2000, Calendar.APRIL, 1000);
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d, YYYY");
		String result = sdf.format(cal.getTime());
		System.out.println(result);
	}

}
