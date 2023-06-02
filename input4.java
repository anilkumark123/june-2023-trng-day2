import java.util.Scanner;
class input3{

public static void main (String args[])
{
Scanner scob = new Scanner(System.in);
int num1,num2;
num1=scob.nextInt();
num2=scob.nextInt();
int temp;
temp=num1;//temp=5
num1=temp;//num1=7
num2=temp;//num2=5
System.out.println(num1+"\n"+num2);
}
}