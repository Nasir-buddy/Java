package Patterns;
import java.util.Scanner;
public class Double_sided_holo_piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter the row no : "); 
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int spc = 0 ; spc <= n - i; spc++){
                System.out.print(" ");
            }
            for(int j = 1; j <= ((2 * i) - 1) ; j++){
                if( j == 1 || (j == (2*i)-1)){
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            {
                System.out.println();
            }
        }

        for(int i = n - 1; i >= 1; i--){
            for(int spc = 0; spc <= n - i; spc++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= ((2*i)-1); j++){

                if(j == 1 || j == ((2*i)-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            {
                System.out.println();
            }
        }
    }
}
