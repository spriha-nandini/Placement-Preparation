package LeetCode;

public class 69_SqrtX {
    class Solution {
    public int mySqrt(int x) {
        double q=Math.sqrt(x);
        for(int i=0;i<=x/2;i++){
            if(i*i==x){
                return i;
            }
        }
        return (int) q;
    }
}
}
