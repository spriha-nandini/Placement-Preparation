package day6;
interface AA {
    void colour();
}
interface AB{
    void shape();
}
class AC implements AA,AB{
    public void texture(){
        System.out.print("the texture is smooth");
    }
    public void shape(){
        System.out.print("the shape is round");
    }
    public void colour(){
        System.out.print("the colour is red");
    }
}
public class interfacei{
    public static void main(String[] args){
    AC c=new AC();
    c.texture();
    c.shape();
    c.colour();
    }
}