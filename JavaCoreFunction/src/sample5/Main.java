package sample5;

import java.util.Calendar;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);

        Function<Calendar, Integer> getYear = cal -> cal.get(Calendar.YEAR);

        System.out.println("Year: " + getYear.apply(calendar)); 
    }
}
	