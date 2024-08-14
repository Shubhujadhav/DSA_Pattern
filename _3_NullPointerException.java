public class _3_NullPointerException {
    public static void main(String[] args) {
        try{
            String str = null;
            System.out.println(str.length()); //Cannot invoke "String.length()"because "str"is null
            int num = Integer.parseInt("xyz"); //Number Format Exception
        }catch (NullPointerException ne){
            System.out.println("Null pointer exception occured");
        }catch (NumberFormatException nfe){
            System.out.println("number format exception occured...");
        }catch (Exception e){
            System.out.println("Some other exception occured...");
        }
    }
}