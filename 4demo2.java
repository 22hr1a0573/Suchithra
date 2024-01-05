import java.util.Scanner;
class ArithmeticOperators{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of firtst number");
double num1=sc.nextDouble();
System.out.println("enetr the value of second number");
double num2=sc.nextDouble();

double sum=num1+num2;
double difference=num1-num2;
double product=num1*num2;
double quotient=num1%num2;
if(num2==0)
	
	System.out.println("Zero is invalid eneter another number");
	double num=sc.nextDouble();}
	double div=num/num2;
else	{
	double div=num1/num2;
	}

System.out.println("sum of two numbers="+sum);
System.out.println("difference of two numbers="+difference);
System.out.println("product of two numbers="+product);
System.out.println("div of two numbers="+div);
System.out.println("quotient of two numbers="+quotient);

}
}