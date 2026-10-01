package s5day2;
import java.util.*;
public class hashset {
    public static void main(String args[]){
        HashSet<String> s = new HashSet<>();
        s.add("sachin");
        s.add("rohit");
        s.add("rahul");
        s.add("sachin");
        System.out.println(s);
        String a ="D";
        s.remove("sachin");
        System.out.println(s);
        System.out.println("contains" + " " + a + " " + s.contains(a));
    }
}