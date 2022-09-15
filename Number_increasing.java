package Patterns;
import java.util.Scanner;
public class Number_increasing {
    public static void main(String[] args) {
        int n ; 
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print(i + " ");
            }
            {
                System.out.println();
            }
        }
    }
}