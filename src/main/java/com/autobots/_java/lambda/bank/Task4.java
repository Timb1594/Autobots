package com.autobots._java.lambda.bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,33,82,91,3,9,88));
        int evenNumbers = 0;
        for(Integer l: list){
            if(l%2==0){
                evenNumbers += 1;
            }
        }
        System.out.println(evenNumbers);
        System.out.println("_________");
        System.out.println();
        System.out.println(centeredAverage());


        ArrayList<String> strings = new ArrayList<>(Arrays.asList("bad", "good", "bad", "awesome"));
       for(int i=0; i<strings.size(); i++){
           if(strings.get(i).equals("bad")){
               strings.set(i, "nice");
           }
       }
        System.out.println(strings);
    }

//    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(12, 84, 83, 90, 11,82));
//    Iterator<Integer> itr = new Iterator<Integer>() {
//    }

    public static int centeredAverage() {
        int [] nums = {1,2,3,4,100};
        int min = nums[0];
        int max =nums[0];
        int result = 0;
        int count =0;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<min) min = nums[i];
            if(nums[i]>max) max = nums[i];
        }
       for(int i = 0;i<nums.length; i++){
           if(nums[i] != min && nums[i] != max){
               result += nums[i];
               count ++;
           }
       }

        return result/count;
    }

}
