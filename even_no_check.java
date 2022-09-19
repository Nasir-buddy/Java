package Normal_programs;
import java.util.Scanner;

public class even_no_check {
    public static void main(String[] args) {
        int n ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbe to check number is even or odd ...");
        n = sc.nextInt();
        int rem = n % 2;
        if (rem == 0)
        {
            System.out.println("Even Number..");
        }
        else 
        {
            System.out.println("Odd number..");
        }
    }
}
