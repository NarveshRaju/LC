class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        Arrays.sort(nums);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            right = n-1;
            left = i+1;
            while(left<right){
                int a = nums[i];
                
                if(a + nums[left]+ nums[right]== 0){
                    List<Integer> inner = Arrays.asList(a,nums[left],nums[right]);
                    ls.add(inner);
                    left++;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }}
                    else if(a+nums[left]+nums[right]>0){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
            }return ls;
        }
        
    }
