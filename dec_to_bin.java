package Normal_programs;
import java.util.Scanner;

public class dec_to_bin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for integer to binary form ..");
        int s = sc.nextInt();
        System.out.print(Integer.toBinaryString(s));
        
    }
}
