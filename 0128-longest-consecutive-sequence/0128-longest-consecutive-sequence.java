class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int sum = 1;
        int count = 0;
        int max = 0;
        for(int i : st){
        if(!st.contains(i-1) && (st.contains(i+1))){
            count = 1;
            
            while(st.contains(i+count)){
                sum++;
                count++;
            }

        }
        max = Math.max(sum,max);
        sum=1;
        }
        return max;
    }
}