public class UserDefinedExceptionsDemo extends Exception{
    public UserDefinedExceptionsDemo(String str){
        super (str);
    }
    public static void main(String[]args) throws UserDefinedExceptionsDemo{
        try{
            System.out.println("Enter the age:");
            java.util.Scanner s=new java.util.Scanner(System.in);
            int num=s.nextInt();
            if(num<20){
                throw new UserDefinedExceptionsDemo("You are not eligible for this examination");
            }
            else{
                System.out.println("You are eligible for this exam");
            }
        }
        catch(UserDefinedExceptionsDemo ud){
            ud.printStackTrace ();
        }

    }
}
