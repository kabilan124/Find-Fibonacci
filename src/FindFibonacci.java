import java.util.*;
public class FindFibonacci{
    public  static int fib(int A) {
        if (A == 0) {
            return 0;
        }if (A==1)return 1;
        return(A-1)+(A-2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println(FindFibonacci.fib(A));
    }
}