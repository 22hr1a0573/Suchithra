import java.util.Scanner;
class Test{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int rd=0;
System.out.println("enter any positive integer:");
n=sc.nextInt();
int num=n;
while(n>0){
rd=rd*10+(n%10);
n=rd/10;
}
 if( num==rd)
 {System.out.println("Palondrome");}
 else
 {System.out.println("Not a palindrome");}
}
}