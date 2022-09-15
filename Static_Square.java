package Patterns;
import java.util.Scanner;
public class  Static_Square{
    public static void main(String[] args) {
        for(int i = 1; i<= 7; i++)
        {
            for(int j = 1; j<= 7; j++)
            {
                if( i == 1 || i == 7 || j == 1 || j ==7 )
                {
                    System.out.print("4");
                }
                else if ( i == 2 || i == 6 || j == 2 || j == 6)
                {
                    System.out.print("3");
                }
                else if( i == 3 || i == 5 || j == 3 || j == 5)
                {
                    System.out.print("2");
                }
                else 
                {
                    System.out.print("1");
                }
            }
            {
                System.out.println();
            }
        }
    }
}