package com.kevin.java21.switchcase;


import com.kevin.java21.record.Employee;
import com.kevin.java21.record.Order;

/**
 * @Author Kevin  on 2023/10/6
 */
public class SwitchRecord {

  static Object getObject() {
//    return new Order(1L, "2");
//    return new Employee(1L, "2",2);
    return null;
  }

  public static void main(String[] args) {
    var object = getObject();
    //可將參數展開 或是 直接判定是否為 該型別 宣告為變數
    switch (object) {
      case null -> System.out.println("obj is null ");
      case Order(Long id, String name) -> System.out.println("obj is Order " + id + ",name = " + name);
      case Employee e -> System.out.println("obj is Employee = "+ e);
      default -> throw new IllegalStateException("Unexpected value: " + getObject());
    }
  }
}
