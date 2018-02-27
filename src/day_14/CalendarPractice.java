/*
 * Hacker Rank Day 14 - Java
 * Packages, Imports, Scope
 */
package day_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    



    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 100);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formated = format1.format(cal.getTime());
        System.out.println(formated);
    }

}
