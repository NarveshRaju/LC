class Solution {
    int ps[];
    public int subarraySum(int[] nums, int k) {
        this.ps = new int[nums.length];
        ps[0] = nums[0];
        int count = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 1;i<nums.length;i++){
            ps[i] =ps[i-1] + nums[i];
            
            
        }
        for(int i = 0;i<ps.length;i++){
            if(ps[i]==k){
                count++;
            }
            if(mp.containsKey(ps[i]-k)){
                count+= mp.get(ps[i]-k);
            }mp.put(ps[i],mp.getOrDefault(ps[i],0)+1);
        }
        return count;
    }
}