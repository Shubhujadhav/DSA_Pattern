class simple{
  void hi (String name){
    System.out.println("hi" +name);
  }
  void hello (String name){
     System.out.println("hello" +name);
  }
}
public class _2_SecoundProgram{
  public static void main(String[] args) {
    simple s = new simple();
    s.hi("Sumaiyya");
    s.hello("Vaishali");
  }
}