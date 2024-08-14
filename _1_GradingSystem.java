import java.util.Scanner;
public class _1_GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter how many marks youn have :");
        double marks = Double.parseDouble(scn.nextLine());

        //logic
        if (marks >=90){
            System.out.print("excellent");
        }else if (marks >= 80){
            System.out.print("Good");
        }else if (marks >=70){
            System.out.print("fair");
        }else if (marks >= 60){
            System.out.print("meets expectation");
        }else{
            System.out.print("Below par");
        }
         System.out.println();
        }
    }
    


