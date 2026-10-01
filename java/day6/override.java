//writing the 
//parent class
package day6;
public class override {
    void eat(){
        System.out.println("1");
    }
}
//child is inheriting from animal
class dog extends override{
    void eat(){
        System.out.println("2");
    }
}
//grandchild has inheritance from dog
class puppy1 extends dog{
    void eat(){
        System.out.println("3");
    }
}
//main class
class d{
    public static void main(String[] args){
        override an=new override();
        an.eat();//inherited from puppy class
        dog dg=new dog();
        dg.eat();//inherited from dog class
        puppy1 puppy = new puppy1();
        puppy.eat();//inherited from animal class
    }
}