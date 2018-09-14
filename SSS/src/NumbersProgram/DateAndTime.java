package NumbersProgram;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		Date d= new Date();
		SimpleDateFormat ft1= new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat ft2= new SimpleDateFormat("E");
		SimpleDateFormat ft3= new SimpleDateFormat("hh:mm:ss a");
		SimpleDateFormat ft4= new SimpleDateFormat("MMM");
		System.out.println(ft1.format(d));
		System.out.println(ft2.format(d));
		System.out.println(ft3.format(d));
		System.out.println(ft4.format(d));
		
 
	}

} 
