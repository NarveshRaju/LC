class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int mid = x/2;
        int ans = 0;
        if(x == 0){
            return 0;
        }if(mid == 0){
            return 1;
        }
        
        while(start<=end){
            if(mid == x/mid){
                return mid;

            }
            else if(mid<(x/mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
}