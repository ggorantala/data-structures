package dev.ggorantala.ds.arrays.inplace;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 25/05/23
 */

import java.util.Arrays;

public class ArrayInPlaceAlgorithm {
  public static void reverseArray(int[] array) {
    int startIndex = 0;
    int endIndex = array.length - 1;

    while (startIndex < endIndex) {
      // Swap elements at startIndex and endIndex indices
      int temp = array[startIndex];
      array[startIndex] = array[endIndex];
      array[endIndex] = temp;

      // Move towards the center
      startIndex++;
      endIndex--;
    }
  }

  public static void main(String[] args) {
    final int[] INPUT = {1, 2, 3, 4, 5};
    System.out.println("Original Array: " + Arrays.toString(INPUT));

    reverseArray(INPUT);
    System.out.println("Reversed Array: " + Arrays.toString(INPUT));
  }
}
