class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int smallest = Integer.MAX_VALUE;
        int largest = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0){
                st.add(nums[i]);
                if(nums[i]<smallest){
                    smallest = nums[i];
                }
                if(nums[i]>largest){
                    largest = nums[i];
                }
            }
            
        }
        if(smallest!=1){
            return 1;
        }
        else{
            for(int j = smallest+1;j<largest;j++){
                if(!st.contains(j)){
                    return j;
                    
                }
                
            }
        }
        return largest+1;
    
    }
}