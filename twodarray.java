import java.util.Scanner;

public class twodarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the row size");
        int rows = sc.nextInt();
        System.out.println("enter the cols");
        int cols = sc.nextInt();

        
        int[][] arr = new int[rows][cols];

    System.out.println("enter the elments of array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

      
        for (int i = 0; i < rows; i++) {
           
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int sum=0;
        for (int i = 0; i < rows; i++) {
            sum=0;
            for (int j = 0; j < cols; j++) {
                sum+=arr[i][j];
            }
            System.out.println(sum+" ");
        }
       
    }
}