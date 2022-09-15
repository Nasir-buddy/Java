package Patterns;
import  java.util.Scanner;
public class Number_Piramid_increasing_pattern{
    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of the row : "); 
        n = sc.nextInt();
        int count = 1; 
        for(int i = 1; i <= n; i++){
            for(int spc = 0 ; spc <= n -i ; spc++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            {
                System.out.println();
            }
        }
    }
}