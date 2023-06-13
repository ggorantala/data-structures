package dev.ggorantala.ds.chartype;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 13/06/23
 */

public class ASCIIExample {
  public static void main(String[] args) {
    char ch = 'A';

    if (ch >= 0 && ch <= 127) {
      System.out.println(ch + " is an ASCII character.");
    } else {
      System.out.println(ch + " is not an ASCII character.");
    }
  }
}
