import java.util.Scanner;
public class _11_Pattern {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter n value :");
        int n = Integer.parseInt(scn.nextLine());

        //logic
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j||i+j==n+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
