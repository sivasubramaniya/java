import java.util.*;
public class loan{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your salary :");
        int salary= scan.nextInt();
        System.out.println("enter your age :");
        int age= scan.nextInt();
       
        if(salary>=20000 && age<25)
        {
            System.out.println("eligible for loan");
            System.out.println("how much loan do you need :");
            int amount=scan.nextInt();
            if(amount<50000)
            {
            System.out.println("loan available");
            }
            else
            {
            System.out.println("not available");
             }
        }
    }
}
