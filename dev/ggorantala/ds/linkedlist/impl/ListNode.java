package dev.ggorantala.ds.linkedlist.impl;
/*
 * This code is part of the course "Java Data Structures and Algorithms" for https://ggorantala.dev.
 *
 * Copyright (C) 2023 by Gopi Gorantala.
 *
 * @author ggorantala
 * Date: 27/05/23
 */

public class ListNode {
  private final int data;
  private final ListNode next;

  ListNode(int data) {
    this.data = data;
    this.next = null;
  }
}
