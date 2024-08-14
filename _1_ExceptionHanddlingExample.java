import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Business logic class
class Division{
    public int div (int n1, int n2){
       return (n1/n2);                           //ArithmaticException 
    }
}
    //Execution logic class
public class _1_ExceptionHanddlingExample {
    public static void main(String[] args) {

        try {     //code that might throw 
            BufferedReader br = new BufferedReader(new InputStramReader(System.in));
            System.out.print("Enter 1st number:");
            int n1 = Integer.parseInt(br.readLine());   //1)IOException ,2) NumberFormatException
            System.out.print("Enter 2nd number");
            int n2 = Integer.parseInt(br.readLine());   //1) OIException , 2) NumberFormatException
    
            //creating object w.r.t Division class 
            Division division = new Division();
            int ans = division.div(n1 , n2);            //Arithmatic Exception
            System.out.println((n1+"/"+n2+"is :"+ans));
        }catch (IOException ie ){                       //code that handles the exception if it occures.
            System.out.println("input error...");
        }catch (NumberFormatException nfe){
            System.out.println("don't enter character ,String and and special symbol as input ,please try to enter integer value....");
    
        }catch (ArithmaticException ae){
            System.out.println("don't pass 0 as denomiter...");
        }
    }

}

