class C
{
public void disp()
{
System.out.println("Mesthod of class C");
}
}
class A extends C
{
public void disp()
{
System.out.println("method of class A");
}
}
class B extends C
{
public void disp()
{
System.out.println("Method of class b");
}
}
class D extends A
{
public void disp()
{
System.out.println("Method of class D");
}
public static void main(String args[]){
D obj = new D();
obj.disp();
}
}