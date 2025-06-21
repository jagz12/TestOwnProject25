package com.myproject.jag;

public class Operators {
    public static void main(String[] args) {
//        int x = 3;
//        x--;
//        same as writing x = x + 1
//        and -- is the same as x = x - 1
//        Use case examples -
//        System.out.println(x);

//        for (int i = 1; i <= 5; i++){
//            // In this for loop, we are declaring a variable called 'i' which equals 1
//            // According to the conditions it will print the value of 'i'
//            // with the 'i++" it will increment i by 1. It will now be 2
//            // with the 'i <= 5' it will check the value of i, if it is less than or equal to 5 inclusive
//            System.out.println(i);
//            // It will print all numbers where i is <= 5 and i++ is the operator that adds the increments
//        }
//        // Once it gets to 6 it will break out of this loop
//        System.out.println("Breakout");

//        Integer myInt = 3; // Needs to be whole numbers
//        Double myDouble = 3.4; // Floating point numbers (decimals)
//
//        Integer answer = 8/2; // This will clearly devise into 2
//        // This will print out 4
//        System.out.println(answer);
//
//        Integer result = 8/3; // This will not equal a decimal.
//        // As this is looking at integers. it will calculate how many times 2 goes into 8, which is 3
//        // The answer will be the left over, which is 2
//        System.out.println(result);
//
//        Double outcome = 8.0/3;
//        // Using double for floating point numbers we can get the actual value, accurate answer
//        System.out.println(outcome);

        // Modulo Operator %
        // Exercise - Days of the week

//        Integer daysInAWeek = 7;
//        Integer daysToMyBirthday = 23;
//        Integer weekToMyBirthday = daysToMyBirthday / daysInAWeek;
//        Integer days = daysToMyBirthday % daysInAWeek;
//        System.out.println(weekToMyBirthday);
//        System.out.println(days);

//        int num = 12;
//        boolean result = num % 2 ==0;
//        // Here we are checking if 'int' is divisible by 2 with no remainder (==0)
//        // if it is then boolean result will show 'true' otherwise it will be 'false'
//        // = is an assignment operator (x =3)
//        // == is a comparison operator, comparing value on left to value on right
//        // >>> To make this more short-hans (num += 3)
//        System.out.println(result);

        boolean isWearingParachute = false;
        boolean jumpOutOfPlane = true;

        if(isWearingParachute && jumpOutOfPlane){
            System.out.println("Congrats you have made a successful jump!");
        } else {
            System.out.println("Don't jump");
        }

        int num = 3;
        if(num % 2 ==0){
            // By adding a '!' - if(!(num % 2 ==0)) We are asking 'if num is NOT divisible
            System.out.println("Div by 3");
        } else {
            System.out.println("Not Div by 3");
        }



    }
}
