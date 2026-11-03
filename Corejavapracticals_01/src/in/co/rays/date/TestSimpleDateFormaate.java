package in.co.rays.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormaate {
	
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date ();
		
		//System.out.println(d);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		
	String today =	sdf.format(d);
	//System.out.println(today);
	
	String dob = "20-12-2025";
	
	Date doob = sdf.parse(dob);
	System.out.println(doob);
	
	
		
	}

}
