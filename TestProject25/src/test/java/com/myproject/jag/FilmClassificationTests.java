package com.myproject.jag;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FilmClassificationTests {

    @Test
    @DisplayName("First Unit Test")
    public void returns_UandPGfilms_whenUnder_12(){
        // Arrange
        int age = 11;
        String expected = "U and PG films are available";
        // Actual - Call the method under test
        String actual = FilmClassification.getClassificationsByAge(age);
        //Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Second Unit Test")
    public void returns_U_PG_and12films_whenUnder15_andOverEqual12(){
        // Arrange
        int age = 14;
        String expected = "U, PG and 12 films are available";
        //Actual
        String actual = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Boundary Test")
    public void returns_U_PG_and12films_whenEnter12(){
        //Arrange
        int age = 12;
        String expected = "U, PG and 12 films are available";
        // Actual
        String actual = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Third Unit Test")
    public void returns_AllfilmsAreAvailable_ifEnterOver18(){
        // Arrange
        int age = 20;
        String expected = "All films are available";
        //Actual
        String actual = FilmClassification.getClassificationsByAge(age);
        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
