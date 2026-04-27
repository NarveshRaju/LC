class Solution {
    public int[] searchRange(int[] nums, int target) {
        int size = nums.length;
        int front = 0;
        int back = nums.length - 1;
        int frontPos = -1;
        int backPos = -1;
        if(size == 0){
                int[] finalpos = {-1,-1};
                return finalpos;
            }
        for(int i =0; i< size; i++){
            if(frontPos == -1){
            if(nums[i] == target)
            {
                frontPos= i;
            
            }}
            if(backPos == -1){
            if(nums[back]== target){
                backPos = back;
                
            }}
            back--;
            
        }
        int[] finalarr = {frontPos,backPos};
        return finalarr;
    }
}