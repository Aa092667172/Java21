package com.kevin.java21.sequenced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Kevin  on 2023/10/10
 */
public class ListDemo {
  public static void main(String[] args) {
    var list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.addFirst(1);
    list.addLast(2);
    System.out.println("list.getFirst() = " + list.getFirst());
    System.out.println("list.getLast() = " + list.getLast());
    list.removeLast();
    list.removeFirst();
    System.out.println(list);
    list.reversed();
    System.out.println(list);
  }

}
