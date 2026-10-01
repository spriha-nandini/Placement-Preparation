package s5day8;
class test{
    int x;
    test(){
        x=10;
    }
}
public class obj {
    public static void main(String args[]){
        test obj = new test();
        System.out.println(obj.x);
    }
}