package day5;

public class dog {
    String name;
    String colour;
    public dog(String name, String colour){
    this.name=name;
    this.colour=colour;
    }

    public void display(){
        System.out.print(name+" " +colour);
    }
}
class Colour{
    public static void main(String[] args){
        dog mypet= new dog("coco","brown");
        mypet.display();
}
}

