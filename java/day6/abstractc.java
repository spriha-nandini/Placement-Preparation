//abstract is used to overcome the limit of hierarchal inheritance so 
//you can extent multiple classes to 1 parent
package day6;
abstract class shape {
    abstract void draw();
}
class Circle extends shape
{
    void draw()
    {
        System.out.println("a circle is drawn");
    }
    void colour(){
        System.out.println("the colout is red");
    }
}
class Square extends shape{
    void draw(){
        System.out.println("a square is drawn");
    }
    void colour(){
        System.out.println("the colour is blue");
    }
}
public class abstractc{
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        c.colour();
        Square s = new Square();
        s.draw();
        s.colour();
    }
}
