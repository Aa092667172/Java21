package com.kevin.java21.switchcase;

/**
 * @Author Kevin  on 2023/10/6
 * 新特性switch case when
 * 判定型別 加上 when true 時 等同於判定型別而已
 * 因此假設
 * case Integer b when true  -> System.out.println(" 111 b is Number = " + b);
 * case Integer b  -> System.out.println("哈哈ㄏ b is Number = " + b);
 * 編譯將會錯誤
 */
public class SwitchWhen {

  static Number getNumber() {
    return Integer.valueOf(30);
  }

  public static void main(String[] args) {
    Number a = getNumber();
    switch (a) {
      case null -> System.out.println(" a is null");
      case Integer b when b >= 20 && b <= 50 -> System.out.println(" b is Number and bwteen 20 and 50 = " + b);
      case Long b -> System.out.println("b is Long = " + b);
      default -> System.out.println("我都沒成立");
    }
  }
}
