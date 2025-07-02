package com.autobots._java.lambda.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Pineapple"));
        boolean hasGrape = false;
        for(String l: list){
            if(l.equals("Banana")){
                System.out.println("There is Banana!");
            }
            if(l.equals("Grape")){
                hasGrape =  true;
            }
        }
        if(hasGrape){
            System.out.println("there is Grape");
        }else{
            System.out.println("There is no Grape!");
        }
    }

}
