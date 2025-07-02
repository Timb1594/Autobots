package com.autobots._java.lambda.tasks;

import java.util.HashMap;
import java.util.Map;

public class MapTask2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Alex", 5);
        map.put("Doni", 3);
        map.put("Lisa", 5);
        map.put("Sasha", 2);

        Map<Integer, Integer> countMap = new HashMap<>();
        for(Integer value: map.values()){
            countMap.put(value, countMap.getOrDefault(value,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: countMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("оценка "+ entry.getKey()+"встречается "+ entry.getValue() + " раз");
            }
        }
    }
}
