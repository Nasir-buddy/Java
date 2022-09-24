package Normal_programs;
import java.util.Scanner; 
public class fact_function
{
    static int fact(int n)
    {
        int answer = 1; 
        for(int i = 1; i <= n; i++)
        {
        answer = answer * i; 
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
        int r = sc.nextInt(); 

        int num = fact(n); 
        int denominator1 = fact(r); 
        int denominator2 = fact(n-r); 

        int answer = num/(denominator1*denominator2); 
        System.out.println(answer);
    }
}