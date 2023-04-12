package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input the string : ");
        String inputString = input.next();
        StringUtils stringUtils = new StringUtils();
        System.out.println(stringUtils.reverse(inputString));
        System.out.println(stringUtils.EmptyOrNot(inputString));
        System.out.println(stringUtils.isPalindrome(inputString));

    }
}

