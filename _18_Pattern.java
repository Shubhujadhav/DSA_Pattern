import java.util.Scanner;
public class _18_Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value");
        int n = Integer.parseInt(scn.nextLine());

        //logic
        for(int i=1;i<=10;i++){
         System.out.println(n+"x"+i+"="+(n*i));            

        }
    }
}
