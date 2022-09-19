package Normal_programs;
import java.util.Scanner;
public class Character_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character......");
        char n = sc.next().charAt(0);
        if (n >= 'A' && n <= 'Z')
        {
            System.out.println("Capital Alphabet....");
        }
        else if (n >= 'a' && n <= 'z')
        {
            System.out.println("Small Character...");
        }
        else 
        {
            System.out.println("Not a character....");
        }
    }
}
