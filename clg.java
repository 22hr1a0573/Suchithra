class Student{
int rollno;
String name;
static String college="MIIET";
Student(int r,String n){
rollno=r;
name=n;
}
void display(){ System.out.println(rollno+" "+name+" "+college);
}
}
public class clg{
public static void main(String args[]){
Student s1=new Student(573,"suchi");
Student s2=new Student(572,"souji");
Student.college="B.R.V";
s1.display();
s2.display();
}
}