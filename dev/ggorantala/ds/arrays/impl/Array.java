package dev.ggorantala.ds.arrays.impl;

/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 23/05/23
 */

public class Array {
  private int[] data;
  private int size;

  public Array(int capacity) {
    data = new int[capacity];
    size = 0;
  }

  public void insert(int element) {

    // if the array is full, resize it
    if (data.length == size) {
      // create a new array (twice the size)
      int[] newData = new int[size * 2];

      // copy all existing items
      for (int i = 0; i < size; i += 1) {
        newData[i] = data[i];
      }
      data = newData;
    }
    data[size] = element;
    size++;
  }

  public boolean isOutOfBounds(int index) {
    return index < 0 || index >= size;
  }

  public void remove(int index) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    }

    for (int i = index; i < size; i += 1) {
      data[i] = data[i + 1];
    }
    size--;
  }

  public int get(int index) {
    if (isOutOfBounds(index)) {
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public int size() {
    return size;
  }

  public void print() {
    for (int i = 0; i < data.length; i += 1) {
      System.out.print(data[i] + ", ");
    }
  }
}
