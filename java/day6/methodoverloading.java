//the system chooses the code to execute on the basis of the input given
package day6;
public class methodoverloading {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(double a, double b){
        System.out.print(a+b);
    }
}
class m{
    public static void main(String[] args){
        methodoverloading a =new methodoverloading();
        a.add(3,4);
        a.add(4.5,3.7);

    }
}
