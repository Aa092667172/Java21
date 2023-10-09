package com.kevin.java21.unnamed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author Kevin  on 2023/10/9
 */
public class Symbol {
  public static void main(String[] args) throws FileNotFoundException {
    //error   可能是bug
    try (var _ = new FileInputStream("/Users/eton/Desktop/ttt")) {

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
//    Object a = new Order(1L, "1");
//    if (a instanceof Order(Long id, _)) {
//      System.ot.println(id);
//    }

  }

}
