package Patterns;
import java.util.Scanner;
public class Reverse_number_increasing {
    public static void numberpattern_medium(int n ){
        
        int k ;
        for(int i = 0 ; i <= n; i++)
        {
            k = i;
            for(int j = 0; j < i; j++)
            {
                System.out.print(k);
                k -= 1;
            }
            {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n ; 
        n = s.nextInt();
        numberpattern_medium(n); 

    }
}
