class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int size = nums.length;
        int largest = 0;
        int count = 0;
        for(int i = 0;i<size;i++){
            if(nums[i]!=1){
                count=0;
            }
            if(nums[i]==1){
                count++;
                if(count>largest){
                    largest = count;
                }
            }
        }
            return largest;

    }
}