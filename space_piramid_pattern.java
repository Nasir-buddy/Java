package Patterns;
import java.util.Scanner; 
public class temp {
    public static void pattern(int n){
        for(int i = 1; i <= n; i++){
            for(int space = 1 ; space <= n-i; space++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        pattern(n);
    }
}
