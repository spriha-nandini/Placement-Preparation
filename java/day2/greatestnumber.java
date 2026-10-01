//print the greatest number
package day2;
import java.util.Scanner;
class greatestnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,z;

        System.out.print("enter x: ");
        x=sc.nextInt();
        System.out.print("enter y: ");
        y=sc.nextInt();
        System.out.print("enter z: ");
        z=sc.nextInt();
        if(x==y && y==z){
            System.out.print("all numbers are equal: ");
        }else{
        if(x>y){
            if(x>z){
                System.out.print(x + " is the gretest number: ");
            }else{
                System.out.print(z + " is the greatest number: ");
            }
        }else{
            if(x>z){
            System.out.print(y + " is the greatest number: ");
        }else{
            if(y>z){
                System.out.print(y + " is the grestest number: ");
            }else{
                System.out.print(z + " is the greatest number: ");
            }
        }
    }
}sc.close();
}
}