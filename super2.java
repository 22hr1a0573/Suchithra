class A{
void eat(){System.out.println("Starving");}
}
class Animal extends A{
void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
void eat(){System.out.println("esting bread.....");}
void bark(){System.out.println("barking");}
void work(){
super.eat();
bark();
}
}
class TestSuper2{
public static void main(String args[]){
Dog d=new Dog();
d.work();
}
}