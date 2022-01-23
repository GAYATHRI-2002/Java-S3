import java.util.*;
public class natural
{
   public static void main (String args[])
   {
     Scanner obj= new Scanner(System.in);
     int i,n;
     System.out.println("enter the number");
     n=obj.nextInt();
     System.out.println("factor of "+n+" are:");
     for(i=0;i<=n;i++)
     { 
          if(n%i==0)
          { System.out.println(i+"");
          }
     }
   }
