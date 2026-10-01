
package s6day2;
import java.util.*;

public class letter1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();     // read full input (aabbccaa)
        
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        
        // append the last character + count
        result.append(s.charAt(s.length() - 1)).append(count);
        
        System.out.println(result.toString());
    }
}
