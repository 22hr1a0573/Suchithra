class Employee{
float salary=40000;
}
class P extends Employee{
int bonus=10000;
public static void main(String args[]){
P p1=new P();
System.out.println("Programmer salary is:"+p1.salary);
System.out.println("Bonus of Programmer is:"+p1.bonus);
}
}