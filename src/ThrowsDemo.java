public class ThrowsDemo {
    public int array()throws ArithmeticException,ArrayIndexOutOfBoundsException{
        int arr[]={1,2};
        arr[3]=3;
        return arr[1];
    }
    public static void main(String []args){
        ThrowsDemo obj=new ThrowsDemo();
        try{
            obj.array();
        }
        catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
        }
        System.out.println("Program executed successfully");
    }

}
