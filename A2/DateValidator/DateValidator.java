// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2019T1, Assignment 2
 * Name:
 * Username:
 * ID:
 */

import ecs100.*;
import java.awt.Color;
import java.util.*;

/**
 * Reads a date from the user as three integers, and then checks that the date is valid
 */

public class DateValidator {

    /**
     * Asks user for three integers and then checks if it is a valid date.
     */
    public void doCore(){
        int day = UI.askInt("Day:   ");
        int month = UI.askInt("Month: ");
        int year = UI.askInt("Year:  ");
        this.validateDateCore(day, month, year);
    }

    /** CORE
     * Determines whether the date specified by the three integers is a valid date.
     * Should report any components of the date that are invalid
     *  and report whether the whole date is valid or not.
     * For the Core, you may assume that
     * - All months have 31 days, numbered 1 to 31
     * - The months run from 1 to 12
     * - Years start from 1
     */
    public void validateDateCore(int day, int month, int year){
        if ((day >= 1 && day <= 31) && (month >= 1 && month <= 12) && (year >=1)) {
           UI.println("This date is valid:");
        }
        else {
            if (day > 31 || day < 1) {
                UI.printf("the day %d is not valid", day);
            }
            else if (month > 12 || month < 1) {
                UI.printf("the month %d is not valid", month);
            }
            else if (year < 1) {
                UI.printf("the year %d is not valid", year);
            }
        }    

    }

    /**
     * Asks user for three integers and then checks if it is a valid date.
     */
    public void doCompletion(){
        int day = UI.askInt("Day:   ");
        int month = UI.askInt("Month: ");
        int year = UI.askInt("Year:  ");
        this.validateDateCompletion(day, month, year);
    }

    /** COMPLETION
     * Determines whether the date specified by the three integers is a valid date.
     * Reports any components of the date that are invalid
     * Prints if the date is valid or not valid
     * For the Completion, you should check that
     * - Months have the correct number of days
     * - On leap years February can have 29 days.
     *    A year is a leap year if:
     *       - The year can be evenly divided by 4 but not 100, (eg 2016 but not 1900) OR
     *       - The year can be evenly divided by 400    (eg 2000)
     */
    public void validateDateCompletion(int day, int month, int year){
        /** code here */
        

    }

}
