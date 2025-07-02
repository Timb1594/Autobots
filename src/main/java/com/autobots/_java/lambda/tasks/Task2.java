package com.autobots._java.lambda.tasks;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
       int[] reverse = {12,22,32};
       int[] test1 = new int[6];
       test1[test1.length-1]=6;

        System.out.println(Arrays.toString(new int[]{reverse[2],reverse[1],reverse[0]}));
        System.out.println(Arrays.toString(test1));
       //System.out.println(Arrays.toString(new int[]{test1[5]=6}));
    }
//    public int[] reverse2(){
//        //return new int[]{reve}
//    }
}
