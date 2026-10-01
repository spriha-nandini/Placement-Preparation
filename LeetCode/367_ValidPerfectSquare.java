package LeetCode;

public class 367_ValidPerfectSquare {
    class Solution {
    public boolean isPerfectSquare(int num) {
        int right=num;
        int left=0;
        while(left<=right){
            int mid=(right+left)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>=num){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
}
