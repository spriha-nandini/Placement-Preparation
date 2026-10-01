package day7;
import java.util.Scanner;
class versionms{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m,k,count=0;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int [] arrm = new int[m];
        int [] arrk = new int[k];
        for(int i=0;i<m;i++){
            arrm[i]=sc.nextInt();
        }
        for(int i=0;i<k;i++){
            arrk[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<k;j++){
                if(arrm[i]==arrk[j]){
                    arrk[j]=-1;
                    count++;
                }
            }
    }
    int r=(m-count)+(k-count)+count;
    int ut=n-r;
        System.out.print(count+" ");
        System.out.print(ut);
        sc.close();
        }
}