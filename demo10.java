import java.util.Scanner;
class Test{

public static void main(String args[]){
Scanner scob=new Scanner(System.in);
char s=scob.next().charAt(0);

if((s>='A'&& s<='Z')||(s>='a'&& s<='z'))
System.out.println("YES");
else
System.out.println("NO");
}
}