class Solution {
    public int removeElement(int[] nums, int val) {
        int numSize = nums.length;
        int left= 0;
        int right = 1;
        int counter =0 ;
        for(int i = 0;i<numSize;i++){
            if(nums[i]!= val){
                nums[left]= nums[i];
                left++;
            }
        }
        return left;
    }
}