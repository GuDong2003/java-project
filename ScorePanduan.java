/*
 * @Author: 咕咚
 * @Date: 2023-03-16 00:33:03
 * @LastEditTime: 2023-03-16 00:41:25
 * @LastEditors: 咕咚
 * @Description: LOVE YOURSELF IN YOUR IMAGINATION~
 * Copyright (c) 2023 by 咕咚，All Rights Reserved.
 */

import java.util.Scanner;

public class ScorePanduan {
    public static void main(String[] args) {
        int score;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数：");
        score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("请输入有效成绩:");
            score = sc.nextInt();
            sc.close();

        }

        switch ((int) score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'c';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'E';

        }

        System.out.println(grade);
    }
}