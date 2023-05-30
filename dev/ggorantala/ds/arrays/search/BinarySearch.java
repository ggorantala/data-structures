package dev.ggorantala.ds.arrays.search;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 26/05/23
 */

public class BinarySearch {
  public static int binarySearch(int[] nums, int target) {
    int startIndex = 0;
    int endIndex = nums.length - 1;

    while (startIndex <= endIndex) {
      int middleIndex = startIndex + (endIndex - startIndex) / 2;

      if (nums[middleIndex] == target) {
        return middleIndex; // return the index if the element is found
      } else if (nums[middleIndex] < target) {
        startIndex = middleIndex + 1; // continue searching in the endIndex half
      } else {
        endIndex = middleIndex - 1; // continue searching in the startIndex half
      }
    }

    return -1; // return -1 if the element is not found
  }

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7};
    int target = 4;

    int index = binarySearch(nums, target);
    if (index != -1) {
      System.out.println("Element " + target + " found at index " + index);
    } else {
      System.out.println("Element not found");
    }
  }
}
