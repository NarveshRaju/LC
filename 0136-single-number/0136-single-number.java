class Solution {
    public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int size = nums.length;
    int finalvalue = 0;
    for(int i = 0;i<size;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],1);
        }
        else{
            map.put(nums[i],0);
        }
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    if (entry.getValue() == 0) {
        finalvalue = entry.getKey();
    }
}
        return finalvalue;

    }
}