class circle{
int radius;

void insert(int r){
radius=r;
}
void calculateperimeter()
{
System.out.println(2*3.14*radius);}
}
class Testcircle{
public static void main(String args[]){
circle r1=new circle ();

r1.insert(11);

r1.calculateperimeter();

}}
