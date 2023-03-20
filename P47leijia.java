public class P47leijia {
    public static void main(String[] args) {
        int i = 1, sum = 0;
        while (i <= 99) {
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("1+3+5+...+99=" + sum);
    }
}