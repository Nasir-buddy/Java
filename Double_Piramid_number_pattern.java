package Patterns;
import java.util.Scanner;
public class Double_Piramid_number_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int n = sc.nextInt(); 

        for(int k = 1 ; k <= n ; k++)
        {
            for(int y = 0 ; y <= n - k; y++)
            {
                System.out.print(" ");
            }
            for(int l = 1; l <= k ; l++)
            {
                System.out.print(" " + k);
            }
            {
                System.out.println();
            }
        }

        for(int i = n - 1; i >= 1; i--)
        {
            for(int l = 0 ; l <= n - i; l++)
            {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--)
            {
                System.out.print(" " + i);;
            }
            {
                System.out.println();
            }
        }
    }
}
