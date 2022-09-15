package Patterns;
import java.util.Scanner;
public class OneLine_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int spc = 0 ; spc < n-i; spc++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <=n; j++)
            {
                if(i == j)
                {
                    System.out.print("*");
                }
            }
            {
                System.out.println();
            }
        }
    }
}
