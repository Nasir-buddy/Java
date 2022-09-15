package Patterns;
import java.util.Scanner;
public class Number_increasing_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the row  : "); 
        int n = sc.nextInt(); 
        int count = 1; 
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
}