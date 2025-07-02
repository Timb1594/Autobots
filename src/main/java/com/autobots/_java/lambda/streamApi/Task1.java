package com.autobots._java.lambda.streamApi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

       List<Integer> list1 = new ArrayList<>( );
       list1.add(12);
       list1.add(0);
       list1.add(13);
       list1.add(9);
       Iterator<Integer> itr1 = list1.iterator();
       while (itr1.hasNext()) {
           int n = itr1.next();
           if (n > 10 && n < 70) {
               itr1.remove();
           }
       }
        System.out.println(list1);






        List<Integer> nums = new ArrayList<>( List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> itr = nums.iterator();
        while (itr.hasNext()){
           int n = itr.next();
           if(n%2==0){
               itr.remove();
           }
        }
        System.out.println(nums);


    }
}
