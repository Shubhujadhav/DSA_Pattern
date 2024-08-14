import java.util.Scanner;
public class _8_Pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter n value :");
        int n = Integer.parseInt(scn.nextLine());
        //logic
        int nst = n/2+1;
        int nsp = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*\t");
            }
             //space print
             for(int j=1;j<=nsp;j++){
                System.out.print("\t");
             }
             //star ptint
              for(int j=1;j<=nst;j++){
                System.out.print("*\t");
              }
              if(i<=n/2){
                nst--;
                nsp+=2;
              }else{
                nst++;
                nsp-=2;
              }
              System.out.println();
        }
    }
}
