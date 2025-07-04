package com.autobots._java.lambda.codingbat;

public class String21 {
    public static void main(String[] args) {
        String str = "abc.xyz";
        boolean result = check(str);
        System.out.println(result);
    }
      public static boolean check(String str){
        for(int i = 0; i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("xyz")&&!str.substring(i-1,i).equals(".")) return true;
        }
        return false;
    }


    }

