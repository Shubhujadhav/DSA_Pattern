import java.util.Scanner;
public class _2_FibonacciTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter n number :");
        int n = Integer.parseInt(scn.nextLine());

        //logic
        int a = 0;
        int b = 1;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            int c = a+b;
            a=b;
            b=c;
        }
    }
}
