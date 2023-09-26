import java.util.*;
public class Max
{
   public static void main(String args[])
   {
       System.out.println("Enter 3 numbers");
       Scanner sc= new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       if(a>c && a>b)
       {
             System.out.println(+a+" Is max number");
       }
       else if(b>a && b>c)
       {
            System.out.println(+b+" Is max number");
       }
       else
       {
            System.out.println(+c+" Is max number");
        }
    }
}