
/*
 * @Author: 咕咚
 * @Date: 2023-03-20 10:50:10
 * @LastEditTime: 2023-03-22 09:35:08
 * @LastEditors: 咕咚
 * @Description: LOVE YOURSELF IN YOUR IMAGINATION~
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */
import java.util.Scanner;

public class huiwenshu {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, t;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        num1 = sc.nextInt();
        t = num1;
        while (num1 != 0) {
            num2 = num2 * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        if (num2 == t)
            System.out.println(t + "是回文数！");
        else
            System.out.println(t + "不是回文数！");
        sc.close();
    }
}