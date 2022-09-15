package Patterns;
import java.util.Scanner;
public class Upper_piramid {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        n = s.nextInt();
        for (int i = 0; i <= n; i++) 
        {
            for(int spc = 0; spc <= n-i; spc++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) 
            {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
}
