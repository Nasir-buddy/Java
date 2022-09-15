package Patterns;
import java.util.Scanner;
public class numberPattern_function {
    public static void pattern_hard(int n){
        for(int i = 1; i <= n; i++){
            for(int spc = 0; spc <= n - i; spc++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int k = 2 ; k <= i ; k++){
                System.out.print(k);
            }
            {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number : ");
        int n = sc.nextInt();
        pattern_hard(n);
    }
}
