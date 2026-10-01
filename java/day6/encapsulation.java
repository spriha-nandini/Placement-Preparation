package day6;
import java.util.Scanner;
class student {
    private String name;
    public void setname(String name){
        this.name=name;
    }

public String getname(){
    return name;
}
}
public class encapsulation{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        student st=new student();
        String name;
        System.out.print("enter name: ");
        name=sc.next();
        st.setname(name);
        st.getname();
        sc.close();
    }
}