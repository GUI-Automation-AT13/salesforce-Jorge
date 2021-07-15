package core;

import java.util.Calendar;
import java.util.Date;

public class Reader {
    private int timeUnit;
    private int quantity;

    public int getTimeUnit(String date) {
        timeUnit = 0;
        if (date.contains("second")) {
            timeUnit = Calendar.SECOND;
        }
        if (date.contains("minute")) {
            timeUnit = Calendar.MINUTE;
        }
        if (date.contains("hour")) {
            timeUnit = Calendar.HOUR;
        }
        if (date.contains("day")) {
            timeUnit = Calendar.DAY_OF_MONTH;
        }
        if (date.contains("month")) {
            timeUnit = Calendar.MONTH;
        }
        if (date.contains("year")) {
            timeUnit = Calendar.YEAR;
        }
        return timeUnit;
    }

    public int getQuantity(String date) {
        String numberOnly= date.replaceAll("[^0-9]", "");
        quantity = Integer.parseInt(numberOnly);
        return quantity;
    }
}
