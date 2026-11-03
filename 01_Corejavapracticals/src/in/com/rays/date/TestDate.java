package in.com.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws ParseException {

		Date d = new Date();
		// System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		// formate Convert Date to string
		// System.out.println(sdf.format(d));

		String dob = "2005-08-02";
		// Parse Convert String into date
		Date dooo = sdf.parse(dob);
		System.out.println(dooo);
		// System.out.println(dob);

	}

}
