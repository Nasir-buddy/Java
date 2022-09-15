package Patterns;
import java.util.Scanner;
public class Left_arror_patern {
    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int  i = n; i > 0; i--)
        {
            for(int spc = n ; spc < n + i; spc++)
            {
                System.out.print(" ");
            }
            for(int j = n ; j > n - i; j--)
            {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
        for(int i = 0; i <= n; i++)
        {
            for(int spc = 0 ; spc <  i ; spc++)
            {
                System.out.print(" ");
            }
            for(int j = 0 ; j < i ; j++)
            {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
}
