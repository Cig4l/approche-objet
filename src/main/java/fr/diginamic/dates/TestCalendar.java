package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY,19,23,59,30); // 19/05/2016
        Date date = calendar.getTime();
        SimpleDateFormat simpleDate1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat simpleDate2 = new SimpleDateFormat("yyyy/MMMM/EEEE hh:mm:ss");
        SimpleDateFormat simpleDate3 = new SimpleDateFormat("yyyy/MMMM/EEEE hh:mm:ss", Locale.FRENCH);
        SimpleDateFormat simpleDate4 = new SimpleDateFormat("yyyy/MMMM/EEEE hh:mm:ss", Locale.forLanguageTag("ru"));
        SimpleDateFormat simpleDate5 = new SimpleDateFormat("yyyy/MMMM/EEEE hh:mm:ss", Locale.GERMAN);
        SimpleDateFormat simpleDate6 = new SimpleDateFormat("yyyy/MMMM/EEEE hh:mm:ss", Locale.CHINESE);
        String formatDate1 = simpleDate1.format(date);
        String formatDate2 = simpleDate2.format(date);
        String formatDate3 = simpleDate3.format(date);
        String formatDate4 = simpleDate4.format(date);
        String formatDate5 = simpleDate5.format(date);
        String formatDate6 = simpleDate6.format(date);

        System.out.println(formatDate1);
        System.out.println(formatDate2);
        System.out.println(formatDate3);
        System.out.println(formatDate4);
        System.out.println(formatDate5);
        System.out.println(formatDate6);
    }
}
