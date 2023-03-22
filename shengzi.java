public class shengzi {
    public static void main(String[] args) {
        double n = 3000, i = 0.0;
        do {
            n /= 2;
            i++;
        } while (n >= 5.0);
        System.out.println("Day=" + i);
    }
}