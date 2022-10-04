package Normal_programs;
import java.util.Scanner;
public class factor 
{
    public static void main(String[] args) {
        int n ; 
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for (int i = 2; i < n; i++)
        {
            if(n%i==0)
            {
                System.out.print(i + " ");
            }
        }
    }
}