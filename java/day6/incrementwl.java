// to print number 1 to 100 without using loops
package day6;
public class incrementwl {
    public static void main(String[] args){
        int n=1;

        rec rc=new rec();
        rc.fun(n);
    }
}
    class rec{
        void fun(int n){
            System.out.println(n);
            n++;
            if(n<=100){
                fun(n);
            }
        }
    }
