import java.util.Scanner;
class Palindrome2{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n;
int pd=1;
System.out.print("Eneter any positive integer:");
n=sc.nextInt();
while(n>0){
pd=pd*(n%10);
n=n/10;
}
System.out.println(pd);
}
}
