//an event management company has come up with a unique idea of printing their event tickets
//based on the ticket number combination the visitor is directed towards a particular class of audience
//the task is to create a program to fetch the ticket number based on the following conditions
//any occurence of digits EF,56 and G should be deleted
//input: 4523EF58G Output:452385
//input:E12F35G58  output:E12F3558
package day9;
import java.util.Scanner;
public class tickets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ticket;
        System.out.print("enter your ticket code: ");
        ticket=sc.nextLine();
        char[] chars = ticket.toCharArray();  
        int n = ticket.length();
        char[] result = new char[n]; 
        int index = 0; 
        
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && chars[i] == 'E' && chars[i + 1] == 'F') {
                i++; 
            }
            else if (i < n - 1 && chars[i] == '5' && chars[i + 1] == '6') {
                i++; 
            }
            else if (chars[i] == 'G') {
                continue;
            }
            else {
                result[index] = chars[i];
                index++;
            }
        }
        String processedTicket = new String(result, 0, index);
        
        System.out.println("Processed ticket number: " + processedTicket);
        
        sc.close();
    }
}

