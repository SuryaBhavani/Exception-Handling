public class ExceptionHandlingDemo1 {
    public static void main(String []args) {
        System.out.println("A program which demonstrates the use of try,catch and finally in exception handling");
        try {
            int arr[]={1,2};
            arr[3]=5;
            int a = 19;
            int b = 0;
            int c = a / b;
            System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        } catch (ArithmeticException e) {
            e.printStackTrace(); //it will display the complete path and the reason for the occurance of the exception
            //System.out.println(e.toString());//display the type of the exception and the reason
            //System.out.println(e.getMessage());//display only the reason
            //System.out.println("We can't divide a number with zero");//user defined statement
        } catch (ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace ();
        }
        finally {

            System.out.println("Try can't be used alone and it should be followed by either catch block or finally block or both of them");
            System.out.println("A single try block can contains multiple catch blocks");
            System.out.println("But we can use only one finally block");
        }
    }
}
