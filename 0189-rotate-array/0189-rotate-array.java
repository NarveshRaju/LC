class Solution {
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int numSize = nums.length;
        reverseSubArray(nums,0,numSize-k-1);
        reverseSubArray(nums,numSize-k,numSize-1);
        reverseSubArray(nums,0,numSize-1);}
        public void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
        
}