package com.kevin.java21.str;

import static java.lang.StringTemplate.STR;

/**
 * @Author Kevin  on 2023/10/6
 * 編譯會出錯提示<br>
 * String templates are not supported at language level '21'<br>
 * 因STR目前為預覽版本,後續jdk在更新才會成為正式功能
 */
public class StrPatten {
  public static void main(String[] args) {
    int a = 10;
    String s = STR."""
        哈哈,我是長字串 \{a}
        """;
    System.out.println("s = " + s);
  }
}
