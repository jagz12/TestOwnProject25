package com.myproject.jag;

public class Main {
    public static void main(String[] args) {
        int timeOfDay =9;
        greeting(timeOfDay);

    }

    private static void greeting(int timeOfDay) {
        if(timeOfDay >= 5 && timeOfDay <=12){
            System.out.println("Good Morning");
        } else if (timeOfDay >=12 && timeOfDay <= 18){
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
    }
}