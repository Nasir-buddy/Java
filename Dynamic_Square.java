package Patterns;
import java.util.Scanner;
;
public class Dynamic_Square {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int realN = n;
        n = 2*n-2;
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j<= n; j++)
            {
                int k = realN - Math.min(Math.min(i, j) , Math.min(n - i , n - j));
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
