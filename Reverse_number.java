package Patterns;
import java.util.Scanner;
public class Reverse_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt();
        for(int i = n; i>=1; i--)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print(i);
            }
            {
                System.out.println();
            }
        }
    }
}
