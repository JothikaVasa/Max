import java.util.*;
public class ifcl
{
   public static void main(String d[])
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the Number");
       int a= sc.nextInt();
       if(a > 0)
       {
             System.out.println(+a+"is a positive number");
       }
       else
       {
             System.out.println(+a+"is a negative number");
       }
   }
}
 