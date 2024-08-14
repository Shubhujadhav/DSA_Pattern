 class Addition{
    int num1,num2,sum;
    //setvalue
    void setValue (int n1,int n2){
       num1 = n1;
       num2 = n2;
 }
   //process value
   void add(){
     sum = num1 + num2;
   }
    //display value
    void display(){
        System.out.println("sum of ("+num1+ "," +num2+")is:"+sum);
    }
}
   public class _3_Addition {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.setValue(10,20);
        a.add();
        a.display();
        }
    }

