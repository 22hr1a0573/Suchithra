class Employee{
int eid;
String ename;
String edepartment;
void insertRecord(int r,String n,String m){
eid=r;
ename=n;
edepartment=m;
}
void displayInformation()
{
System.out.println(eid+" "+ename+" "+edepartment);
}
}
class TestEmployee{
public static void main(String args[])
{
Employee E1=new Employee();
Employee E2=new Employee();
Employee E3=new Employee();
E1.insertRecord(573,"suchi","cse");
E2.insertRecord(572,"Soujanya","cse");
E3.insertRecord(500,"Divya","cse");
E1.displayInformation();
E2.displayInformation();
E3.displayInformation();
}
}