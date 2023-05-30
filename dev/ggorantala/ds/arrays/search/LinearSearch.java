package dev.ggorantala.ds.arrays.search;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 25/05/23
 */

public class LinearSearch {
  public static int linearSearch(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i; // return the index if the element is found
      }
    }
    return -1; // return -1 if the element is not found
  }

  public static void main(String[] args) {
    int[] nums = {5, 2, 9, 1, 7, 4};
    int target = 7;

    int index = linearSearch(nums, target);
    if (index != -1) {
      System.out.println("Element " + target + " found at index " + index);
    } else {
      System.out.println("Element not found");
    }
  }
}
