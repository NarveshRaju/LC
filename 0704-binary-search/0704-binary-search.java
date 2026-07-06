class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        int mid = (start+end)/2;
        int element = searching(nums,target,start,mid,end);
        return element;
    }
    public int searching(int[] nums,int target,int start,int mid,int end){
        if(start == end && nums[start] == target){
            return start;
        }
        if(start == end && nums[start]!=target){
            return -1;
        }
        if(nums[mid]<target){
            start = mid+1;
            mid = (mid + end)/2;
            return searching(nums,target,start,mid,end);
        }
        else{
            end = mid;
            mid = (mid+start)/2;
            return searching(nums,target,start,mid,end);
        }
    }
}