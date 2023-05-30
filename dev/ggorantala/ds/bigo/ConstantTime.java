package dev.ggorantala.ds.bigo;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 30/05/23
 */

public class ConstantTime {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    printFirstElement(array);
  }

  public static void printFirstElement(int[] array) {
    if (array.length > 0) {
      System.out.println(array[0]); // Accessing the first element
    } else {
      System.out.println("Array is empty.");
    }
  }
}
