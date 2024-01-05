class Icard{
private String clgname;
private String clgaddr;
private int start;
private int end;
private int id;
private String studentname;
private String coursename;
private int adharno;
public void setClgname(String clgname)
{this.clgname=clgname;}
public void setClgaddr(String clgaddr)
{this.clgaddr=clgaddr;}
public void setStart(int start)
{this.start=start;}
public void setEnd(int end)
{this.end=end;}
public void setId(int id)
{this.id=id;}
public void setStudentname(String studentname)
{this.studentname=studentname;}
public void setCoursename(String coursename)
{this.coursename=coursename;}
public void setAdharno(int adharno)
{this.adharno=adharno;}
public String getClgname(){return clgname;}
public String getClgaddr(){return clgaddr;}
public int getStart(){return start;}
public int getEnd(){return end;}
public int getId(){return id;}
public String getStudentname(){return studentname;}
public String getCoursename(){return coursename;}
public int getAdharno(){return adharno;}
}
class BCA{
public static void main(String args[]){
Icard s=new Icard();
s.setClgname("MOTHER THERESA INSTITUTE OF ENGINEERING AND TECNOLOGY");
s.setClgaddr("PLAMNER,MELUMOI(POST)");
s.setStart(900);
s.setEnd(600);
s.setId(27789);
s.setStudentname("Suchithra");
s.setCoursename("CSE");
s.setAdharno(747474747474);
System.out.println("clgname:"+s.getClgname());
System.out.println("clgaddr:"+s.getClgaddr());
System.out.println("start:"+s.getStart());
System.out.println("end:"+s.getEnd());
System.out.println("id:"+s.getId());
System.out.println("studentname:"+s.getStudentname());
System.out.println("coursename:"+s.getCoursename());
System.out.println("adharno:"+s.getAdharno());
}
}




