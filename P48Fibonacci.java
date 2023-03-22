/*
 * @Author: 咕咚
 * @Date: 2023-03-20 10:29:30
 * @LastEditTime: 2023-03-22 09:35:21
 * @LastEditors: 咕咚
 * @Description: LOVE YOURSELF IN YOUR IMAGINATION~
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */
public class P48Fibonacci {
    public static void main(String[] args) {
        final int max = 15;
        int i = 0, j = 1, k = 1;
        while (k < max) {
            System.out.print(" " + i + " " + j);
            i = i + j;
            j = i + j;
            k = k + 2;
        }
        System.out.println();
    }
}