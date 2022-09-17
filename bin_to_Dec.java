package Normal_programs;
import java.util.Scanner;
public class bin_to_Dec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String b = s.next();
        int decimal; 
        decimal = Integer.parseInt(b,2);
        System.out.println(decimal);
    }
}
