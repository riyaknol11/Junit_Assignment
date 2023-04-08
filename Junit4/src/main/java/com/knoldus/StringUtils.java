package com.knoldus;


class StringUtils{

    public String reverse(String string){

        if(EmptyOrNot(string))
            return "Invalid input";
        String  reverse = "";
        for(int index =string.length()-1; index >=0; --index){
            reverse = reverse + string.charAt(index);
        }
        return reverse;
    }

    public boolean EmptyOrNot(String string){
        if(string.length()==0)
            return true;
        else
            return false;
    }


    public boolean isPalindrome(String string){

        if(EmptyOrNot(string))
            return false;
        String reverse = "";
        for(int index = string.length()-1; index>=0; --index){
            reverse = reverse + string.charAt(index);
        }
        if(string.toLowerCase().equals(reverse.toLowerCase())) {
            return true;
        }
        else{
            return false;
        }
    }
}
