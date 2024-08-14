public class _2_MultipleCatchBlocks {
    public static void main(String[] args) {
        try{
            int [] numbers = new int[5];    //{0,0,0,0,0}
            //trying to insert the value at index 10 
            numbers [10] =50 ;    //This will throw ArrayOutOfBondException
        }catch (ArrayIndexOutOfBoundsException aiobe){
            System.err.println("try to insert values within a index :"+aiobe);  //in,out,err
        }catch (Exception e){   //General exception occured...
            e.printStackTrace();   
                
        }
    }
}
