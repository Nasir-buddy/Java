package Patterns;

import java.util.Scanner;

public class Double_Piramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt(); 
        for(int i =1; i <= n; i++)
        {
            for(int spc = 1; spc <= n-i; spc++)
            {
                System.out.print(" ");
            }
            for(int j =1  ;j<= i; j++)
            {
                System.out.print(" *");
            }
            {
                System.out.println();
            }
        }
        for(int i = n-1; i >= 1; i--)
        {
            for(int spc = 1; spc <= n-i; spc++)
            {
                System.out.print(" ");
            }
            int j = 0; 
            for(;j< i; j++)
            {
                System.out.print(" *");
            }
            {
                System.out.println();
            }
        }
    }
}