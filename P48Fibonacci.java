public class P48Fibonacci{
    public static void main(String[] args){
        final int max=15;
        int i=0,j=1,k=1;
        while(k<max){
            System.out.print(" " + i + " " + j);
            i = i + j;
            j = i + j;
            k=k+2;
        }
        System.out.println();
    }
}