import java.util.*;
public class fibanocci
{
    public static void main(String[] args) 
    {
       
        Scanner obj=new Scanner(System.in);
        int t1 = 0, t2 = 1;
         System.out.print("Enter the number of terms: ");
        int n=obj.nextInt();   
         System.out.println("First " + n + " terms of fibonnaci series: ");
        
        for (int i = 1; i <= n; ++i)
        {
            System.out.println(t1 + " ");
             int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
