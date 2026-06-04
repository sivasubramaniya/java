import java.util.*;
public class demo {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a value :");
        int a=scan.nextInt();
        System.out.println("enter b value :");
        int b=scan.nextInt();
        if(a>b)
        {
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
