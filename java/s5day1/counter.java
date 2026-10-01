package s5day1;

public class counter {
    int count=0;
    counter(){
        count++;
        System.out.println(count);

    }
    @SuppressWarnings("unused")
    public static void main(String args[]){
        counter c1= new counter();
        counter c2= new counter();
        counter c3= new counter();
        counter c4= new counter();
        counter c5= new counter();
        System.out.print(c1);
    }
}
