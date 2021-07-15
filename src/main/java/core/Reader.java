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

import java.util.Calendar;

public class Reader {
    private int timeUnit;
    private int quantity;

    /**
     * Obtains the time units to be set.
     *
     * @param date is the string with a time unit.
     * @return a integer that represents the time unit.
     */
    public int getTimeUnit(final String date) {
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
    /**
     * Obtains the values to be set.
     *
     * @param date is the string with the values to be set on a date.
     * @return a integer with the values to set in a date.
     */
    public int getQuantity(final String date) {
        String numberOnly = date.replaceAll("[^0-9]", "");
        quantity = Integer.parseInt(numberOnly);
        return quantity;
    }
}
