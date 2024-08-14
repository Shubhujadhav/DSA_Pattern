import java.util.Scanner;
public class _13_PrimeTIllN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter low value :");
        int low = Integer.parseInt(scn.nextLine());
        System.out.print("Enter high value :");
        int high = Integer.parseInt(scn.nextLine());

        //logic
        for (int i=low;i<=high;i++){
            boolean isprime = true;
            for (int div=2;div*div<=i;div++){
              if(i % div==0){
                 boolean isPrime = false;
                 break;
              }
            }
            if (isprime){
                System.out.println(i+"is prime");
            }else{
                System.out.println(i+"is not prime");
            }

        }
    }
}
