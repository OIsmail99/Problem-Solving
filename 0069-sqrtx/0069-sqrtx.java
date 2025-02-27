class Solution {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while(left <= right){
            int mid = left + (right - left) / 2; //avoid overflow
            long square = (long)mid * mid;
            if(square == x){
             return mid;   
            }
            if(square > x){
                right = mid -1;
            }
            if(square < x){
                left = mid + 1;
            }
        }
        return right;
    }
}