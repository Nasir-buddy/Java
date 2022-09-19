package Normal_programs;
import java.util.Scanner;

public class Average_of_3_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String C = sc.nextLine();
        System.out.print("Enter first interger : ");
        int a  = sc.nextInt();
        System.out.print("Enter second integer :");
        int b  = sc.nextInt();
        System.out.print("Enter third integer :");
        int c  = sc.nextInt();
        int sum = ( a + b + c) / 3;
        System.out.println(C);
        System.out.println(sum);
    }
}