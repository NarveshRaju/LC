class Solution {
    List<List<Integer>> outer = new ArrayList<>();
    List<Integer> inner = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
    calculate(nums,0); 
    return outer;       
    }
    
    public List<List<Integer>> calculate(int[] nums, int idx){
        if(idx == nums.length - 1){
            List<Integer> ans = new ArrayList<>();
            for (int n : nums) ans.add(n);
            outer.add(ans);
            return outer;
        }
        for(int i = idx;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            calculate(nums,idx+1);

            int temp1 = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp1;
        }
        return outer;
    }
}