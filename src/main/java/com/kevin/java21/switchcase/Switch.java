package com.kevin.java21.switchcase;

/**
 * @Author Kevin  on 2023/10/6
 * 新特性switch case 箭頭表達
 */
public class Switch {
  public static void main(String[] args) {
    //改變a的型別,進行測試
    Object a = "123";
    switch (a) {
      // case null for check null or NullPointException
      case null -> System.out.println("a is null");
      case String b -> System.out.println("b is Str = " + b);
      case Number b -> System.out.println("b is Number = " + b);
      //與 try catch 一樣 case有順序性,不得先父類在子類
      // case Integer b -> System.out.println("b is Integer = " + b);
      default -> System.out.println("b is don't know type ");
    }
  }
}
