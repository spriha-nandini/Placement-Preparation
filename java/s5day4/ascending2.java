package s5day4;

public class ascending2 {
    public static void main(String args[]){
        int[] arr={3,6,2,4,1};
        int temp;
        for(int j=0;j<arr.length;j++){
            for(int k=j+1; k<arr.length;k++){
                if(arr[j]<arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
            }
        }
        System.out.println("the descending order is:");
        for(int s=0;s<arr.length;s++){
            System.out.println(arr[s]+" ");
        }
        for(int j=0;j<arr.length;j++){
            for(int k=j+1; k<arr.length;k++){
                if(arr[j]>arr[k]){
                    temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;

                }
            }
        }
        System.out.println("the ascending order is:");
        for(int s=0;s<arr.length;s++){
            System.out.println( arr[s] + " ");
        }

    }
}
