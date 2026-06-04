import java.util.*;
class pettern{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        String symbal=scan.nextLine();
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(symbal);
            }
            System.out.println();
        }
    }
}