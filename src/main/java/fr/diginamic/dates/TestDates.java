package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {
    public static void main(String[] args) {
        Date date1 = new Date();
        SimpleDateFormat simpleDate1 = new SimpleDateFormat("dd/MM/yyyy");
        String formatDate1 = simpleDate1.format(date1);

        System.out.println(formatDate1);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, Calendar.MAY,19,23,59,30);
        Date date2 = calendar.getTime();
        SimpleDateFormat simpleDate2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // 2016/05/19 23:59:30
        String formatDate2 = simpleDate2.format(date2);
        System.out.println(formatDate2);
    }
}
