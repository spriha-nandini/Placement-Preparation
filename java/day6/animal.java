//single level inheritance
package day6;

public class animal {
    void eat(){
        System.out.println("animal is eating");
    }
}

class Dog extends animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Display {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
