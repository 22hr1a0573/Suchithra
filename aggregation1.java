class Address{
String city,state,country;
public Address(String city,String state,String country){
this.city=city;
this.state=state;
this.country=country;
}
}
  

class E{
int id;
String name;
Address address;

public E(int id,String name,Address address){
this.id=id;
this.name=name;
this.address=address;
}


void display(){
System.out.println(id+" "+name);
System.out.println(address.city+" "+address.state+" "+address.country);
}

public static void main(String args[]){
Address address1=new Address("punganur","A.P","India");
Address address2=new Address("punganur","A.P","India");


E e1=new E(573,"suchi",address1);
E e2=new E(573,"suchi",address2);

e1.display();
e2.display();
}
}
