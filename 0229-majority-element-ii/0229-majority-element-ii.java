class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])>n/3 && !ls.contains(nums[i])){
                ls.add(nums[i]);
            }
        }
        return ls;
    }
}