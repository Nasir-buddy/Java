package Patterns; 
import java.util.Scanner;
public class Star_BTW_numbers_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++)
        {
            for (int j = 1; j <= 2*n+1; j++) {
                if(i==j || j == (2*(n+1)-i) || j == (n+1) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("0");
                }
            }
            {
                System.out.println();
            }
        }
    }
}
