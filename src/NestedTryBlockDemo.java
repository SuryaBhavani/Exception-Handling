public class NestedTryBlockDemo {
    public static void main(String [] a){
        try{
            int arr[]={1,2};

            try{

                arr[3]=3/0;
            }
            catch(ArithmeticException ae){
                ae.printStackTrace();
            }
            finally{
                System.out.println("hai");
            }
            arr[4]=3;
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("hello");
        }
    }
}
