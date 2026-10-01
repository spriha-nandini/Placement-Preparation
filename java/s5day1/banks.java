package s5day1;
abstract class bank{
    abstract void funds();
}
class sbi extends bank{
    void funds(){
        System.out.println("suffiecient funds");
    }
}
class icici extends bank{
    void funds(){
    System.out.println("insuffiecient funds");
    }
}
public class banks {
    public static void main (String args[]){
        sbi s= new sbi();
        s.funds();
        icici i=new icici();
        i.funds();
    }
}
