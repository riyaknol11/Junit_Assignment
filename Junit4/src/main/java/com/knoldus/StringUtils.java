package com.knoldus;


class StringUtils{

    public String reverse(String inputString){

        if(EmptyOrNot(inputString))
            return "Invalid input";
        String  reverse = "";
        for(int index =inputString.length()-1; index >=0; --index){
            reverse = reverse + inputString.charAt(index);
        }
        return reverse;
    }

    public boolean EmptyOrNot(String inputString){
        if(inputString.length()==0)
            return true;
        else
            return false;
    }


    public boolean isPalindrome(String inputString){

        if(EmptyOrNot(inputString))
            return false;
        String reverse = "";
        for(int index = inputString.length()-1; index>=0; --index){
            reverse = reverse + inputString.charAt(index);
        }
        if(inputString.toLowerCase().equals(reverse.toLowerCase())) {
            return true;
        }
        else{
            return false;
        }
    }
}
