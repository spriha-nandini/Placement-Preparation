//multi level inheritance
//parent class
package day6;
public class animal1 {
    void eat(){
        System.out.println("animal is eating");
    }
}
//child is inheriting from animal
class Dog extends animal1{
    void bark(){
        System.out.println("Dog is barking");
    }
}
//grandchild has inheritance from dog
class puppy extends Dog{
    void wagtail(){
        System.out.print("puppy is wagging its tail");
    }
}
//main class
class show{
    public static void main(String[] args){
        puppy puppy1 = new puppy();
        puppy1.eat();//inherited from animal class
        puppy1.bark();//inherited from dog class
        puppy1.wagtail();//inherited from puppy class
    }
}