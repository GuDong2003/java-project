/*
 * @Author: 胡顺其
 * @Date: 2023-03-15 15:45:11
 * @LastEditTime: 2023-03-15 17:58:32
 * @LastEditors: 胡顺其
 * @Description: 学号2021105220116
 * 版权所有（只是一个格式而已）
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