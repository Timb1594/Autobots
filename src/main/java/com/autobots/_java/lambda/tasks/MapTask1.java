package com.autobots._java.lambda.tasks;

import java.util.HashMap;
import java.util.Map;

public class MapTask1 {
    public static void main(String[] args) {
        String fruit = "banana";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch: fruit.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) +1);
            }else{
                map.put(ch,1);
            }
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+ ": " + entry.getValue());
        }
    }
}
