package day7;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("ravi",85);
        studentMarks.put("priya",92);
        studentMarks.put("kiran",78);
        studentMarks.put("anjali",90);
        System.out.println("priya: "+studentMarks.get("priya"));
        System.out.println("Student marks: "+studentMarks);
        System.out.println("all student marks: ");
        for(String key:studentMarks.keySet()){
            System.out.println(key+" -> "+studentMarks.get(key));
        }
        if(studentMarks.containsKey("Kiran")){
            System.out.println("Kiran's Marks:" +studentMarks.get("kiran"));
            
        }
    }
}
