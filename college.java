class Student{
int rollno;
String name;
static String college="MIIET";
static void change(){
college="REDDY";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display(){System.out.println(rollno+" "+name+" "+college);}
}
public class college{
public static void main(String args[]){
Student s1=new Student(573,"suchi");
Student s2=new Student(572,"souji");
Student.change();
Student s3=new Student(579,"navya");
s1.display();
s2.display();
s3.display();
}
}

