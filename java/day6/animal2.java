//multi level inheritance
//parent class
package day6;
public class animal2 {
    void eat(){
        System.out.println("animal is eating");
    }
}
//child is inheriting from animal
class Dog extends animal2{
    void bark(){
        System.out.println("Dog is barking");
    }
}
//another child class inheriting from animal
class cat extends animal2{
    void meow(){
        System.out.println("cat is meowing");
    }
}
//main class
class print{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        cat Cat=new cat();
        Cat.eat();
        Cat.meow();
    }
}