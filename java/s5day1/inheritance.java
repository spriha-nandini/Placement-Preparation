package s5day1;
class base{
    public void show(){
        System.out.println("Base::show() called");
    }
}
    class derived extends base{
        public void show(){
            System.out.println("derived::show() called");
        }
    }

public class inheritance {
    public static void main (String args[]){
        base b=new derived();
        b.show();
    }
}
