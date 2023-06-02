import java.util.scanner;
class circle{
public static void main (String args[])
{
int r;
double pi=3.4,area;
scanner s = new scanner(System.in);
System.out.println("Enter radius of circle:");
r = s.nextInt();
area=pi*r*r;
System.out.println("Area of circle: "+area);
}
}