package s5day1;

import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("A");
        obj.add("B");
        obj.add("C");
        obj.add(1, "D"); // Adding "D" at index 1
        System.out.println(obj);
    }
}
