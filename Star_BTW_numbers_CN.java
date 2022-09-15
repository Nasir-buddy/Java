package Patterns; 
import java.util.Scanner;
public class Star_BTW_numbers_CN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Enter the number of rows : ");
        int n = s.nextInt(); 
            for(int i = 1; i<= n; i++)
            {
                for (Integer j = 1; j <= n; j++) {
                    if (j==(n-i+1)) {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(n+1-j);
                    }
                }
                System.out.println();
            }
    }
}
