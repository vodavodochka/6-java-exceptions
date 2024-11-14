package com.example.task02;

public class Task02Main {

    public static void main(String[] args) {
        try {
            System.out.println(getSeason(-5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    static String getSeason(int monthNumber) {
        if ((monthNumber <= 2 && monthNumber >= 1)|| monthNumber == 12){
            return "зима";
        }
        else if (monthNumber >= 3 && monthNumber <= 5){
            return "весна";
        }
        else if (monthNumber >= 6 && monthNumber <= 8){
            return "лето";
        }
        else if (monthNumber >= 9 && monthNumber <= 11){
            return "осень";
        }
        throw new IllegalArgumentException("monthNumber " + monthNumber + " is invalid, month number should be between 1..12");

    }
}