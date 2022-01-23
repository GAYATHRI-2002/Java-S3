import java.util.*;
public class prime
{
  public static void main(String[] args)
  {
      int i,num
    Scanner obj= new Scanner(System.in);
    System.out.println("enter the number");
    n=obj.nextInt();
    boolean flag = false;
    for (int i = 2; i <= n / 2; ++i) {
      
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
