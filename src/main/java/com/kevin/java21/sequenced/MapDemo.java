package com.kevin.java21.sequenced;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author Kevin  on 2023/10/10
 */
public class MapDemo {
  public static void main(String[] args) {
    var map = new LinkedHashMap<String,Integer>();
    map.put("1",2);
    map.putFirst("9",966);
    map.putLast("2",0);
    System.out.println(map);
    //  ?? 看不出來順序有換過
    map.reversed();
    System.out.println(map);
    System.out.println("map.firstEntry() = " + map.firstEntry());
    System.out.println("map.firstEntry() = " + map.lastEntry());

    for(Map.Entry<String,Integer> entry:map.sequencedEntrySet()){
      System.out.println("entry.getKey() = " + entry.getKey());
      System.out.println("entry.getValue() = " + entry.getValue());
    }
    map.sequencedValues().forEach(System.out::println);
    map.sequencedKeySet().forEach(System.out::println);
  }
}
