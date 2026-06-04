import java.util.*;
public class q1 {
    public static void main (String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your name :");
        String name=scan.nextLine();
        System.out.println("enter your age :");
        int age=scan.nextInt();
        System.out.println("enter your address :");
        scan.nextLine();
        String address=scan.nextLine();
        System.out.println("user name is:"+name);
        System.out.println("user age is:"+age);
        System.out.print("user address :"+address);
    }
    
}
