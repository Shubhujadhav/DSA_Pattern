import java.util.Scanner;
public class _14_CountDigitOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.print("Enter n value :");
        int n = Integer.parseInt(scn.nextLine());

        //logic
        int nod = 0;
        int temp =n;
         while (temp > 0){
            temp = temp /10;
          System.out.print("Total digit in "+n+"number is:"+nod);
            nod++;

        }
    }
}
