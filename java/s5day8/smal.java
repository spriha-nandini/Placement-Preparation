package s5day8;

public class smal {
    public static void main(String args[]){
        int arr[]={12,13,12,10,34,10,1};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("the smallest element is: "+min);
    }
}
