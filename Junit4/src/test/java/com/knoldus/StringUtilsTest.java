package com.knoldus;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class StringUtilsTest{
    StringUtils stringUtils;

    @Before
    public void setup(){
        stringUtils = new StringUtils();
    }

    // reverseStringTestMethod method to test the reverse method on given string
    @Test
    public void testReverseString_givenNonNullString_shouldReturnReverseString(){
        String reversedString= stringUtils.reverse("riya");
        assertEquals("ayir",reversedString);

    }

    @Test
    public void testReverseString_givenEmptyString_shouldReturnInvalid(){

        String reversedString = stringUtils.reverse( "");
        assertEquals("Invalid input", reversedString);
    }

    @Test
    public void testEmptyorNot_givenEmptyString_shouldReturnTrue(){

        boolean result = stringUtils.EmptyOrNot("");
        assertEquals(true,result);
    }

    @Test
    public void testEmptyOrNot_givenNonNullString_shouldReturnFalse(){

        boolean result = stringUtils.EmptyOrNot("riya");
        assertEquals(false, result);
    }


    @Test
    public void testPalindrome_givenPalindromeString_shouldReturnTrue(){

        boolean result=stringUtils.isPalindrome("radar");
        assertEquals(true,result);
    }


    @Test public void testPalindrome_givenNonPalindrome_shouldReturnFalse(){
        boolean result = stringUtils.isPalindrome("Hello");
        assertEquals(false,result);
    }


    @Test
    public void testPalindrome_givenEmptyString_shouldReturnFalse(){
        assertEquals(false,stringUtils.isPalindrome(""));
    }
    @After
    public void tearDown(){
        System.out.println("Test Passed!");
    }

}
