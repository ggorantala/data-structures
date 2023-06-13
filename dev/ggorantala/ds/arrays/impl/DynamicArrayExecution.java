package dev.ggorantala.ds.arrays.impl;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 23/05/23
 */

public class DynamicArrayExecution {
    private static final int[] INPUT = new int[] {1, 2, 3, 4, 5, 6, 7, 11, 9};

    public static void main(String[] args) {
        Array array = new Array(4);
        for (int value : INPUT) {
            array.insert(value);
        }

        array.remove(2); // removed element `3` from array

        System.out.println(array.get(0)); // 1
        System.out.println(array.size()); // 8

        // The extra o's are because of the array capacity which is 16
        array.print(); // 1, 2, 4, 5, 6, 7, 11, 9, 0, 0, 0, 0, 0, 0, 0, 0
    }
}
