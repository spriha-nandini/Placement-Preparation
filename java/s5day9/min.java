package s5day9;

import java.util.Scanner;

public class min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input string: ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int temp[] = new int[256];
        for(int i = 0; i <arr.length; i++){
            temp[arr[i]]++; }

        int min = Integer.MAX_VALUE;
        int index = 0;
        for(int i =255; i >= 0; i--){
            if(temp[i]==0)
            continue;
            min = Math.min(min, temp[i]);
        }
        for(int i = 0; i<arr.length;i++){
            if(min==temp[arr[i]]){
                System.out.print(arr[i]);
                break;
            }
        }
    }
}