package com.myproject.jag;

import java.lang.reflect.Type;
import java.time.LocalDate;

public class DataTypes {
    public static void main(String[] args) {


        // Java is considered strongly typed because it demands the declaration of every variable with a data type.
        // Users cannot create a variable without the range of values it can hold. e.g. int num = 3 OR String name = "Jag"
        // A variable must be assigned a type (int or String) when declared.
        // We must explicitly declare the data type of the variable

        // Byte - 8bits
        // short - 16bits
        // int - 32bits
        // long - 64bits
        // float - 32bits
        // double - 64bits
        // char - 16bits
        // boolean - 1bit

        int bInt;
        bInt = 4;

//        System.out.println(Byte.MAX_VALUE);
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//
//        System.out.println(Double.MAX_VALUE);
//
//        int myInt = 3;
//        // int is a raw data type or just a primitive data type.
//        // No access to method as it is not wrapped in a class
//        Integer myint2 = 3;
//        // Wrapped class - wrap my primitive type in a class.
//        // So you can do more stuff with it (access to more methods from the variable 'myint2')
//
//        //Also with double
//        double myDouble = 3.3;
//        Double mydouble2 = 3.5;

//        var today = LocalDate.now();
//        System.out.println(today);
//
//        var fiveMonthsLater = today.plusMonths(5);
//        System.out.println(fiveMonthsLater);

        //How old is Nish Code!

        LocalDate nishBday = LocalDate.of(1989,11,2);
        System.out.println(nishBday);
        // Using the above code, use some methods to find out how old I am
        LocalDate today = LocalDate.now();
        System.out.println(today);

        System.out.println("You are " + (today.getYear() - nishBday.getYear()) + " years old");

    }
}