class Book{
private String name;
private String cls;
private String sec;
private int rollno;
private String college;
public void setName(String name){this.name=name;}
public void setCls(String cls){this.cls=cls;}
public void setSec(String sec){this.sec=sec;}
public void setRollno(int rollno){this.rollno=rollno;}
public void setCollege(String college){this.college=college;}
public String getName(){return name;}
public String getCls(){return cls;}
public String getSec(){return sec;}
public int getRollno(){return rollno;}
public String getCollege(){return college;}
}
class BCA{
public static void main(String arge[]){
Book b=new Book();
b.setName("Suchithra");
b.setCls("btech II");
b.setSec("cseB");
b.setRollno(573);
b.setCollege("mtiet");
System.out.println("name:"+b.getName());
System.out.println("cls:"+b.getCls());
System.out.println("sec:"+b.getSec());
System.out.println("rollno:"+b.getRollno());
System.out.println("college:"+b.getCollege());
}
}
