package trainingpractice;
import java.util.HashMap;
public class hashmap {
    public static void main(String[] args){
        HashMap<String,String> capitals=new HashMap<String,String>();
        capitals.put("india","delhi");
        capitals.put("usa","washington");
        System.out.print(capitals);
        for(String i:capitals.keySet()){
            System.out.print(i);
        }
        for(String i:capitals.values()){
            System.out.print(i);
        }
    }
}
