/*
 * @Author: 咕咚
 * @Date: 2023-03-16 21:56:48
 * @LastEditTime: 2023-03-16 22:48:07
 * @LastEditors: 咕咚
 * @Description: LOVE YOURSELF IN YOUR IMAGINATION~
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */

import java.util.Scanner;

public class luckyuser {
    public static void main(String[] args) {
        int num, ge, shi, bai, qian, total;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入客户四位号码：");
        num = sc.nextInt();
        ge = num % 10;// 个位数字
        shi = num / 10 % 10;// 十位数字
        bai = num / 100 % 10;// 百位数字
        qian = num / 1000 % 10;// 千位数字
        total = ge + shi + bai + qian;
        if (ge == 8 || shi == 8 || bai == 8 || qian == 8 || 8 % total != 0)
            System.out.println("该用户不是幸运客户！");
        else
            System.out.println("该用户是幸运客户！");
        sc.close();// 关闭scanner扫描器
    }
}
