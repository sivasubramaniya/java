import java.util.*;
public class traffic {
    public static void main(String[] agrs)
    {
        Scanner traffic = new Scanner(System.in);
        System.out.print("please enter the color :");
        String r=traffic.nextLine();
        if(r.equals("red"))
        {
            System.out.println("stop");
        }
        else if(r.equals("yellow"))
        {
            System.out.println("get ready");
        }
        else if(r.equals("green"))
        {
            System.out.println("go");
        }
        else
        {
            System.out.println("invalid color");
        }
    }
    
}
