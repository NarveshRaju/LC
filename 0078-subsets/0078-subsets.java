class Solution {
    List<List<Integer>> outer = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> inner = new ArrayList<>();
        outer = calc(nums,inner,0);
        return outer;
    }
    public List<List<Integer>> calc(int[] nums,List<Integer> ans,int i){
        if(i==nums.length){
            outer.add(new ArrayList<>(ans));
            return outer;
        }
        ans.add(nums[i]);
        calc(nums,ans,i+1);
        ans.remove(ans.size()-1);
        calc(nums,ans,i+1);
        return outer;
    }
}