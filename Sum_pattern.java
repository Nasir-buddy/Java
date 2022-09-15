package Patterns;
import java.util.Scanner;
public class Sum_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the row : "); 
        int n ; 
        n = sc.nextInt();
        for(int i = 1; i <= n ; i++)
        {
            int k = 1; 
            int m = 0; 
            for(int j = 1; j <= 2*i+1; j++)
            {
                if(j == (2*i))
                {
                    System.out.print("=");
                }
                if ((j%2==0) && (j != (2*i)))
                {
                    System.out.print("+");
                }
                if((j%2 != 0) && (j!=(2*i+1)))
                {
                    System.out.print(k);
                    m +=k;
                    k++;
                }
                if(j==(2*i+1))
                {
                    System.out.print(m);
                }
            }
            {
                System.out.println();
            }
        }
    }
}
