//write a java program to reverse a string with preserving the position of spcaes. for example, if "i am not a
//string" is the given string then the reverse of this string with perserving the position of spaces is "g ni 
// rts tonmai".
package s6day2;
import java.util.*;
public class reversespace {
    public static void main(String[] args){
            Scanner sc=new Scanner (System.in);
    String str=sc.nextLine();
    char[] input=str.toCharArray();
    char[] result= new char[input.length];
    for(int i=0;i<str.length();i++){
        if(input[i]==' '){
            result[i]=' ';
        }
    }
     int j = input.length - 1; 

        for (int i = 0; i < input.length; i++) {
            if (input[i] != ' ') { 
                while (input[j] == ' ') { 
                    j--;
                }
                result[i] = input[j];
                j--;
            }
        }
        System.out.print(result);
}
}
