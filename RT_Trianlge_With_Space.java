package Patterns;
import java.util.Scanner;
public class RT_Trianlge_With_Space {
    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        n = sc.nextInt();
        // System.out.print("1");
        for(int i = 1; i <= n; i++)
            {
                for(int j = 1 ; j <= i; j++)
                {
                    if( j == 1 || j == i || i == n)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                    // System.out.print(j);
                }
                {
                    System.out.println();
                }
            }
            
    }
}
