class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer = nums1.length - 1;
        int nSize = n-1;
        int mSize = m-1;
      while(nSize >=0 && mSize >=0){
                if(nums1[mSize]<=nums2[nSize]){
                    nums1[pointer] = nums2[nSize];
                    nSize--;
                    pointer--;
                    
                }
                else{
                    nums1[pointer] = nums1[mSize];
                    
                        mSize--;
                    
                    pointer--;
                    
                }
            
        }
        while(nSize>=0){
            nums1[pointer] = nums2[nSize];
            nSize--;
            pointer--;
        }      
    }
}
