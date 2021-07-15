/**
 * Copyright (c) 2021 Fundacion Jala.
 *
 * This software is the confidential and proprietary information of Fundacion Jala
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Fundacion Jala
 *
 * @author Jorge Rodrigo Cáceres Velasco
 */
package core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateManager {
    private String dateToConvert;
    public Calendar calendar;
    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * Converts a String to a Date.
     *
     * @param date is the string with a date format
     * @return a Date object
     */
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
            default:
                calendar.add(Calendar.MILLISECOND, 0);
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
