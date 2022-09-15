package Patterns;
import java.util.Scanner;
public class Star_BTW_number_3_CN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= n-i+1 ; j++){
                System.out.print(j);
            }
            for(int s = 0; s < 2*(i-1); s++){
                System.out.print("*");
            }
            for(int k = n-i+1 ; k >= 1; k--){
                System.out.print(k);
            }
            {
                System.out.println();
            }
        }
    }  
}
