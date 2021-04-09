public class ExceptionHandlingDemo2 {
    public static void main(String[]args){
        try{
            int a=2;
            int b=3;
            int c=3/0;
            System.out.println("a="+a+"\nb="+b+"\nc="+c);

        }
        catch(ArithmeticException ae){
            System.out.println(ae.toString());
        }
        catch(Exception e){
            System.out.println("Exception is the super class of all the exceptions");
        }
    }
}
