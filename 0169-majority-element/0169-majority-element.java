class Solution {
    public int majorityElement(int[] nums) {
    int n = nums.length;
    int el=0;
    int count=0;
    for(int i=0;i<n;i++){
        if(count==0){
            el = nums[i];
        }
        
        if(el==nums[i]){
            count++;
        }
        else if(el!=nums[i]){
            count--;
        }

    }
    return el;
    }
}

