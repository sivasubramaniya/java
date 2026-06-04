import java.util.*;
class demo3{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your score :");
        int score=scan.nextInt();
        if(score<50)
        {
            System.out.println("You need to improve");
        }
        else if(score==50 || score>50 && score<70)
        {
            System.out.println("good");

        }
        else 
        {
            System.out.println("excellent");
        }
        
    }
}