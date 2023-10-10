package com.kevin.java21.sequenced;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SequencedSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author Kevin  on 2023/10/10
 */
public class SetDemo {
  public static void main(String[] args) {
    SequencedSet<Integer> set = new LinkedHashSet<>();
    set.add(666);
    set.addFirst(5);
    set.addLast(9);
    set.reversed();
    System.out.println(set);

    TreeSet<Integer> set1 = new TreeSet<>();
    set1.add(111);
    set1.add(666);
    //需特別注意 TreeSet 不能使用 addFirst/addLast,因他是照自然順序排序,無法變換順序
    set1.reversed();
    System.out.println(set1);
    set1.addFirst(5);
    set1.addLast(9);

  }
}
