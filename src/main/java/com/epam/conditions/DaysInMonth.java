package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
         switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("30");
                break;

        }
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("29");
            } else {
                System.out.println("28");
            }
        }

    }

}
