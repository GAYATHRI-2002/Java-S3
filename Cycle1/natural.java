import java.util.*;
public class natural
{
   public static void main (String args[])
   {
     Scanner obj= new Scanner(System.in);
      int i,sum=0,num;
     System.out.println(" enter the natural numbers to be sum");
     num=obj.nextInt();
     for(i=0;i<=num;i++)
       sum=sum+i;
   }
  System.out.println(" sum of number="+sum);
}

   
