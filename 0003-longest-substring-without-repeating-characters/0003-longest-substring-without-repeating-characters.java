class Solution {
    
    public int lengthOfLongestSubstring(String s) {
          int arr[] = new int[256];
          int count = 0;
          int max = 0;
          int right=0; int left = 0;
          if(s.length() == 0){
            return 0;
          }
         while(right < s.length()){
            if(arr[s.charAt(right)] == 0){
                arr[s.charAt(right)] = 1;
                count ++;
                right++;
                max = Math.max(count,max);
            }
            else{
                arr[s.charAt(left)] = 0;
                left++;
                count--;
            }
          }
    
          return max;
    
         
    }

}
