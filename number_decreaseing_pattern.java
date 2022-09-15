package Patterns;
import java.util.Scanner;
public class number_decreaseing_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ; 
        System.out.print("Enter the row number : ");
        n = sc.nextInt(); 
        // int count = n;
        for(int i = 0; i <= n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(j);
            }
            
            {
                System.out.println();
            }
        }
        
    }
}
