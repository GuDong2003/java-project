
/*
 * @Author: 胡顺其
 * @Date: 2023-03-15 09:33:39
 * @LastEditTime: 2023-03-15 15:30:39
 * @LastEditors: 胡顺其
 * @Description: 学号2021105220116
 * 版权所有（只是一个格式而已）
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