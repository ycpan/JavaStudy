package algorithm;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestTypeComparable {
	public static void main(String[] args) {
		System.out.println(new Integer(3).compareTo(new Integer(5)));
		System.out.println("ABC".compareTo("ABE"));
		@SuppressWarnings("deprecation")
		java.util.Date date1 = new Date(2013,9,18);
		@SuppressWarnings("deprecation")
		java.util.Date date2 = new java.util.Date(2013,9,18);
		System.out.println(date1.compareTo(date2));
		Calendar date3 = new GregorianCalendar(2013,9,18);
		Calendar date4 = new GregorianCalendar(2011,9,18);
		System.out.println(date3.compareTo(date4));
	}

}
