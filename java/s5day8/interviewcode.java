package s5day8;
abstract class parent{
    abstract void show();
}
class child extends parent{
    void show(){
        System.out.println("child class method");
    }
}
public class interviewcode {
    public static void main(String args[]){
        parent p = new child();
        p.show();
    }
}
