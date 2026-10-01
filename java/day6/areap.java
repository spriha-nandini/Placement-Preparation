package day6;
import java.util.Scanner;
abstract class shapes {    
}
class square extends shapes{
    void area(int side){
        System.out.println("the area is: "+ (side*side));
    }
    void perimeter(int side){
        System.out.print("the perimeter is: "+(4*side));
    }
}

class circle extends shapes{
    void area(int radius){
        System.out.println("the area is: "+(3.14*radius*radius));
    }
    void perimeter(int radius){
        System.out.print("the perimeter is: "+(2*3.14*radius));
    }
}

class rectangle extends shapes{
    void area(int length, int breadth){
        System.out.println("the area is: "+(length*breadth));
    }
    void perimeter(int length, int breadth){
        System.out.print("the perimeter is: "+(2*(length+breadth)));
    }
}

class triangle extends shapes{
    void area(int base,int height){
        System.out.println("the area is: "+((base*height)/2));
    }
    void perimeter(int side){
        System.out.print("the perimeter is: "+(side*3));
    }
}

public class areap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char h;
        int length,breadth,height,base,side,radius;
        System.out.print("enter the shape(S/C/R/T)");
        h=sc.next().charAt(0);

        switch (h){
            case('S'):
            System.out.print("enter side: ");
            side=sc.nextInt();
            square sq=new square();
            sq.area(side);
            sq.perimeter(side);
            break;

            case('C'):
            System.out.print("enter radius: ");
            radius=sc.nextInt();
            circle ci=new circle();
            ci.area(radius);
            ci.perimeter(radius);
            break;

            case('R'):
            System.out.print("enter length: ");
            length=sc.nextInt();
            System.out.print("enter breadth: ");
            breadth=sc.nextInt();
            rectangle re=new rectangle();
            re.area(length,breadth);
            re.perimeter(length,breadth);
            break;

            case('T'):
            System.out.print("enter base: ");
            base=sc.nextInt();
            System.out.print("enter height: ");
            height=sc.nextInt();
            System.out.print("enter side: ");
            side=sc.nextInt();
            triangle tr=new triangle();
            tr.area(base,height);
            tr.perimeter(side);
            break;

            default:
            System.out.print("please enter valid value");
        }
        sc.close();
    }
}