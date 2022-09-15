package Patterns;
import java.util.Scanner;
public class Reverse_ch_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt();
        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<=i; j++)
            {
                System.out.print((char)('A'+n-i+j-1));
            }
            {
                System.out.println();
            }
        }
    }
}

