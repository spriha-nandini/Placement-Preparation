package day5;

public class calculator {
    //with parameters
    public static int add(int num1,int num2){
        return num1 +num2;
    }


//with  multiple parameters
public static double calculatearea(double radius){
    return Math.PI*radius*radius;
}
}
class Main{
    public static void main(String[] args){
        int sum = calculator.add(5,3);
        System.out.print("sum: "+sum);
        double area =calculator.calculatearea(2.0);
        System.out.print("area: "+area);
    }
}