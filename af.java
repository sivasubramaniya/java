import java.util.*;
public class af
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int[] marks=new int[5];
        for(int i=0;i<=4;i++)
        {
            System.out.println("enter your mark :");
            marks[i]= scan.nextInt();
           
        }
        for(int i=0;i<=4;i++)
        {
        
            System.out.println("your marks :"+marks[i]);
        }
    }
}