package AgesList;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//        creat HashMap to store students list
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 21);
        hashMap.put("Lewis", 22);
        hashMap.put("Cook", 34);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

//        creat TreeMap in main to store key
    Map<String, Integer> treeMap= new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

//      creat LinkedHashMap in main to store students list and display data
        Map<String, Integer> linkedHashMap= new LinkedHashMap<>(16,075f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson", 21);
        linkedHashMap.put("Lewis", 22);
        linkedHashMap.put("Cook", 34);
        System.out.println("\n The age for " + "Lewis is " + linkedHashMap.get("Lewis"));

    }
}

