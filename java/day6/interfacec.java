package day6;
interface shape {
    void draw();
}
class Circle implements shape
{
    public void draw()
    {
        System.out.println("a circle is drawn");
    }
    void colour(){
        System.out.println("the colout is red");
    }
}
class Square implements shape{
    public void draw(){
        System.out.println("a square is drawn");
    }
    void colour(){
        System.out.println("the colour is blue");
    }
}
public class interfacec{
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        c.colour();
        Square s = new Square();
        s.draw();
        s.colour();
    }
}
