package primitives_and_objects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //примеры шаблонов для форматирования даты
        String a = "dd-MM-yyyy";
        String b = "yyyy-MM-dd";
        String c = "HH:mm:ss.SSS";
        String d = "yyyy-MM-dd HH:mm:ss";
        String e = "yyyy-MM-dd HH:mm:ss.SSS";
        String f = "yyyy-MM-dd HH:mm:ss.SSS Z";

        DateFormat df = new SimpleDateFormat(f);

        Date date = new Date();
        System.out.println(df.format(date));
        //работа с календарем
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 10);
        calendar.add(Calendar.SECOND, -100);

        // метка времени
        long timestamp = calendar.getTime().getTime();
        System.currentTimeMillis();

        System.out.println(df.format(calendar.getTime()));




    }


}
