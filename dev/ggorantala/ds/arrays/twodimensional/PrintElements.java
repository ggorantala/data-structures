package dev.ggorantala.ds.arrays.twodimensional;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 11/06/23
 */

import java.util.Arrays;

public class PrintElements {
  public static void main(String[] args) {
    int[][] grid = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
    };

    //    usingDeepToString(grid);
    //    usingForLoop(grid);
    forEachLoop(grid);
  }

  private static void usingForLoop(int[][] grid) {

    int N = grid.length; // rows
    int M = grid[0].length; // columns

    for (int row = 0; row < N; row += 1) {
      for (int col = 0; col < M; col += 1) {
        System.out.println(grid[row][col]);
      }
    }
  }

  public static void usingDeepToString(int[][] grid) {
    System.out.println(Arrays.deepToString(grid));
  }

  public static void forEachLoop(int[][] grid) {
    // Note the different use of "row" as a variable name! This
    // is the *whole* row, not the row *number*.
    for (int[] row : grid) {
      for (int value : row) {
        System.out.println(value);
      }
    }
  }
}
