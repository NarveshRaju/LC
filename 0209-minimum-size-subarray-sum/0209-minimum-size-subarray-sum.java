class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int len =0;
        int maxLen = Integer.MAX_VALUE;;
        int size =0;
        int j = 0;
        for(int i = 0; i<nums.length;i++){
            size+=nums[i];
            while(size>=target){
                len = i-j;
                maxLen = Math.min(len+1,maxLen);
                size-=nums[j];
                j++;   
            }
        }
        if(maxLen == Integer.MAX_VALUE){
            return 0;
        }
        return maxLen;
    }
}