import java.util.Scanner;
public class West{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st number:");
int num1=sc.nextInt();
System.out.println("enter 2nd Number:");
int num2=sc.nextInt();
System.out.println("enter 3rd number:");
int num3=sc.nextInt();
{
if ((num1>=num2)&&(num1>=num3))
	System.out.println("the large number is:"+num1);
if (num2>num3)
	System.out.println("the large number is:"+num2);
else
	System.out.println("the large number is:+num3");
}
{

if((num1<=num2)&&(num1<=num3))
	System.out.println("the smallest number is"+num1);
if(num2<num3)
	System.out.println("the smallest number is"+num2);
else
	System.out.println("the smallest number is"+num3);
}
}
}