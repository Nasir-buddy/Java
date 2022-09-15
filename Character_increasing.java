package Patterns;
import java.util.Scanner;

public class Character_increasing 
{
    public static void main(String[] args) 
    {
        char A = 65;
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char)(A++));
            }
            {
                System.out.println();
            }
        }
    }
}
