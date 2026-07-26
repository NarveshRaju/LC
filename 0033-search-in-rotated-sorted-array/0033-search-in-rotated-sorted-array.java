class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end =  nums.length - 1;
        int mid = start + (end - start) / 2;
        int ans = -1;
        if(nums[end]==target){
            return end;
        }
        while(start<end){
            if(nums[mid]>nums[end]){
                ans =mid;
                start = mid +1;
            }
            else if(nums[mid]<nums[end]){
                end = mid ;
            }
            
            mid = start + (end - start) / 2;
            
        }
        int p = ans;
        if(target>nums[nums.length -1]){
            start = 0;
            end = p;
            mid = start + (end - start) / 2;
            ans = -1;
            while(start<=end){
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target){
                    end = mid -1;

                }
                else if( nums[mid]<target){
                    start = mid +1;
                }
                mid = start + (end - start) / 2;
            }
            return ans;
        }
        if(target<nums[nums.length - 1]){
            start = p +1;
            end = nums.length - 1;
            mid = start + (end - start) / 2;
            ans = -1;
            while(start<=end){
                if(nums[mid] == target){
                    return mid;
                }
                else if(nums[mid]>target){
                    end = mid -1;

                }
                else if( nums[mid]<target){
                    start = mid +1;
                }
                mid = start + (end - start) / 2;
            }
            return ans;
        }
        return ans;
    }
}