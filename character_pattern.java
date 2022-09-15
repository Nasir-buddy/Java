package Patterns;
import java.util.Scanner;
public class character_pattern {
    public static void main(String[] args) {
        int n ; 
        char A = 65;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 0 ; i < n; i++)
        {
            for(int j = 0 ; j <= i ; j++)
            {
                System.out.print((char)(i + 'A'));
            }
            {
                System.out.println();
            }
        }
    }
}
