package Patterns;
import java.util.Scanner;
public class Number_withSpace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++)
        {
            for (Integer spc = 0; spc < n-i; spc++) {
                    System.out.print(" ");
            }
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            {
                System.out.println();
            }
        }
    }
}
