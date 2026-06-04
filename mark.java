import java.util.*;
public class mark {
    public static void main(String[] agrs)
    {
        Scanner mark=new Scanner(System.in);
         int total;
        double average;
        
        int tamil=mark.nextInt();
        int english=mark.nextInt();
        int maths=mark.nextInt();
        int science=mark.nextInt();
        int socialscience=mark.nextInt();
       
        total =tamil+english+maths+science+socialscience;
        average =total/5.0;
        if (average>=35)
        {
            System.out.println("pass");
        } 
        else{
            System.out.println("fail");
        }
    }
}
