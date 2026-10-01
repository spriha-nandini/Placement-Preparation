package trainingpractice;
import java.util.HashSet;
public class hashset {
    public static void main(String[] args){
        HashSet <String> cars=new HashSet<String>();
        cars.add("BMW");
        cars.add("creta");
        cars.add("venue");
        cars.add("ford");
        cars.add("BMW");
        System.out.println(cars);
        System.out.println(cars.contains("BMW"));
        System.out.print(cars.contains("120"));
        cars.remove("BMW");
        System.out.print(cars);
        System.out.print(cars.size());
        cars.clear();
        System.out.print(cars);
    }
}
