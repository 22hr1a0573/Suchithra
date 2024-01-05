class Student{
private int id;
private String name;
public void setId(int id){this.id=id;}
public void setName(String name){this.name=name;}
public int getId(){ return this.id;}
public String getName(){ return this.name;}
}
class program{
public static void main(String args[]){
Student ob1=new Student();
ob1.setId(1111);
ob1.setName("test");
System.out.println("ID:"+ob1.getId());
System.out.println("Name:"+ob1.getName());
Student ob2=new Student();
ob2.setId(26026);
ob2.setName("suchi");
System.out.println("ID:"+ob2.getId());
System.out.println("Name:"+ob2.getName());
Student ob3=new Student();
ob3.setId(26194);
ob3.setName("jan");
System.out.println("ID:"+ob3.getId());
System.out.println("Name:"+ob3.getName());

 
}
}