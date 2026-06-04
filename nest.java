import java.util.*;
public class nest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your scoure :");
        int score=sc.nextInt();
        if(score>35 && score<60)
        {
            System.out.println("video game");
        }
    else if(score>60 && score<90)
        {
             System.out.println("i phone");

        }
        else if(score>90)
        {
            System.out.println("mac book pro");
        }
    }
}
