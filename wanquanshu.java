
/*
 * @Author: 咕咚
 * @Date: 2023-03-22 09:31:34
 * @LastEditTime: 2023-03-22 09:36:26
 * @LastEditors: 咕咚
 * @Description: LOVE YOURSELF IN YOUR IMAGINATION~
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */
import java.util.Scanner;

public class wanquanshu {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个数：");
        num = sc.nextInt();
        sc.close();// 关闭scanner扫描器
        int i, sum;
        for (i = 1, sum = 0; i < num; i++)
            if (num % i == 0)
                sum += i;
        if (sum == num)
            System.out.println(num + "是完全数！");
        else
            System.out.println(num + "不是完全数！");
    }
}