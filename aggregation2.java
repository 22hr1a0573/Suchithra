class Author
{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author auther;
Book(String n,int p,Author auther)
{
this.name=n;
this.price=p;
this.auther=auther;
}
public static void main(String args[]){
Author auther=new Author("suchi",573,"USA");
Book b=new Book("Java for Begginer",800,auther);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("........Author details..........:");
System.out.println("Author Name:"+b.auther.authorName);
System.out.println("Author Age:"+b.auther.age);
System.out.println("Author place:"+b.auther.place);
}
}