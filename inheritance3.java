class Animal{
void eat(){System.out.println("eating.........");}
}
class Dog extends Animal{
void bark(){  System.out.println("barking..........");}
}
class BabyDog extends Dog{
void weep(){System.out.println("weeepingggggg...........");}
}
class testInheritance2{
public static void main(String argd[]){
BabyDog d=new BabyDog();
d.weep();
d.bark();
d.eat();
}
}