import java.util.*;
public class even
{
   public static void main (String args[])
   {
     Scanner obj= new Scanner(System.in);
     int n;
     System.out.println("enteer the number to be checked ");
     n=obj.nextInt();
     if (n%2==0)
     {
       System.out.println(" is even");
       
       else
         System.out.println("is not even");
     }
   }
}
