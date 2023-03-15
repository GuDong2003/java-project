
/*
 * @Author: 胡顺其
 * @Date: 2023-03-15 08:16:48
 * @LastEditTime: 2023-03-15 17:56:57
 * @LastEditors: 胡顺其
 * @Description: 学号2021105220116
 * 版权所有（只是一个格式而已）
 */
import java.util.Scanner;

public class sanshubidaxiao {
    public static void main(String[] args) {
        int num1, num2, num3, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        num2 = sc.nextInt();
        System.out.println("请输入第三个整数：");
        num3 = sc.nextInt();
        if (num1 > num2)
            max = num1;
        else
            max = num2;
        if (num3 > max)
            max = num3;
        System.out.println("最大值是：" + max);
        min = (num1 < num2) ? num1 : num2;
        min = (num3 < min) ? num3 : min;
        System.out.println("最小值是：" + min);
    }
}