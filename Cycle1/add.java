import java.util.*;
public class natural
{
   public static void main (String args[])
   {
     Scanner obj= new Scanner(System.in);
     int n1, n2 ,sum;
     System.out.println("enter n1");
     n1=obj.nextInt();
      System.out.println("enter n2");
     n2=obj.nextInt();
     sum=n1+n2;
     System.out.println("sum of digits is:"+sum);
   }
}
