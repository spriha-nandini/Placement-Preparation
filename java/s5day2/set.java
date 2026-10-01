package s5day2;
import java.util.HashSet;
import java.util.Set;
public class set {
    public static void main(String args[]){
        Set<String> s = new HashSet<String>();
        s.add("b");
        s.add("b");
        s.add("c");
        s.add("a");
        s.add("d");
        System.out.println(s);
    }
}
