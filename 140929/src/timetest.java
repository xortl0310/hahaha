import java.util.Calendar;


public class timetest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int ampm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println("year:" +year);
		System.out.println("month:" +(month+1));
		System.out.println("day:" +day);
		System.out.println("ampm:" +ampm);
		System.out.println("hour:" +hour);
		System.out.println("minute:" +minute);
		System.out.println("second:" +second);
	}

}
