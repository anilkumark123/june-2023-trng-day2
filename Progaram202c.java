import java.util.*;
public class Progaram202c{
public static boolean is even(int n)
{
return((n/2)*2==n);
}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number:");
n=sc.nextInt();
if(iseven(n))
System.out.println("Even\n");
else
System.out.println("odd\n");
}
}