package day2;
import java.util.Scanner;
class possibletriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;

        System.out.print("enter x");
        x=sc.nextInt();
        System.out.print("enter y");
        y=sc.nextInt();
        System.out.print("enter z");
        z=sc.nextInt();
        if(x>0 && y>0 && z>0){
        if(x+y>=z && x+z>=y && y+z>=x){
            System.out.print("a triangle is possible");
        }else{
            System.out.print("the triangle is not possible");
        }
            
}else{
    System.out.print("the triangle is not possible");
}sc.close();
    }
}