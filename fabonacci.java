package Normal_programs;

import java.util.Scanner;
public class fabonacci{
    public static void main(String[] args) {
        int n , a= 0, b=1 , sum = 0; 
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        while (sum <= n)
        {
            a = b; 
            b = sum ; 
            sum = a+b ; 
        
           System.out.println(sum);

           
        }
    }
}