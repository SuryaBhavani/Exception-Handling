public class ThrowDemo {

    public void validate(int age){
        if(age<18){
            throw new ArithmeticException ("You are not eligible to vote");
        }
        else{
            System.out.println("You are eligible to vote");
        }

    }
    public static void main(String[]args){
        System.out.println("Enter age:");
        java.util.Scanner s=new java.util.Scanner(System.in);
        int age=s.nextInt();
        ThrowDemo obj=new ThrowDemo();
        obj.validate(age);
    }
}
