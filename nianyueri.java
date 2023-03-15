/*
 * @Author: 咕咚
 * @Date: 2023-03-15 17:52:57
 * @LastEditTime: 2023-03-15 23:33:33
 * @LastEditors: 咕咚
 * @Description: 爱你所爱
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */
import java.util.Scanner;

public class nianyueri {
    public static void main(String[] args) {
        int year, month, day;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        year = sc.nextInt();
        System.out.println("请输入月份：");
        month = sc.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("请输入有效月份：");
            month = sc.nextInt();
        }
        switch (month) {
            case 2:
                if (year / 4 == 0 && year / 100 != 0 || year / 400 == 0)
                    day = 29;
                else
                    day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            default:
                day = 31;
        }
        System.out.println(day);
    }
}