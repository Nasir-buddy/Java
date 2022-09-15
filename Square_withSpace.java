package Patterns;
import java.util.Scanner;
public class Square_withSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) 
        {
            for (int spc = 1; spc < i; spc++) {
                System.out.print(" ");
            }   
            for (int j = 1; j <= n; j++) 
            {
                System.out.print("*");
            }
            {
                System.out.println(" ");
            }
        }
    }
}
