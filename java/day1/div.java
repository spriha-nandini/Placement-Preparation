//calculating the sum of all numbers divisible by 9 between 100 and 200
package day1;
class div {
    public static void main(String[] args){
        int sum=0;
        for(int i=100;i<=200; i++){
            if(i%9==0){
                sum+=i;
            }
        }
        System.out.print(sum);
    }
    
}
