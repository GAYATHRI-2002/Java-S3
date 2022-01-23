import java.util.*;
public class armstrong
{
   public static void main (String args[])
   {
     Scanner obj= new Scanner(System.in);
       int temp=n;
      int r , sum=0;
     System.out.primtln("enter the number");
     n=obj.nextInt();
     while(n>0)
     { 
       r=n%10;
       sum=sum+r*r*r;
       n=n/10;}
     if(temp==sum)
       System.out.println("it is an armstrong number");
     else
       System.out.println("not an armstrong number");
   }
}
