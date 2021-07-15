package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManager {
    private String dateToConvert;
    public Calendar calendar;
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    public Date manageDate(final String date) throws ParseException {
        dateToConvert = date.toLowerCase();
        calendar = Calendar.getInstance();
        switch (dateToConvert) {
            case "today":
                calendar.add(Calendar.DAY_OF_MONTH, 0);
                break;
            case "tomorrow":
                calendar.add(Calendar.DAY_OF_MONTH, 1);
                break;
            case "yesterday":
                calendar.add(Calendar.DAY_OF_MONTH, -1);
                break;
        }
        if (dateToConvert.contains("ago")) {
            Reader dateReader = new Reader();
            calendar.add(dateReader.getTimeUnit(date), -1 * dateReader.getQuantity(date));
        }
        if (dateToConvert.contains("from now")) {
            Reader dateReader = new Reader();
            calendar.add(dateReader.getTimeUnit(date), dateReader.getQuantity(date));
        }
        if (dateToConvert.contains("/")) {
            Date date1 = formatter.parse(date);
            return date1;
        }
        return calendar.getTime();
    }

}
