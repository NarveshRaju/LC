class Solution {
    public int maxArea(int[] height) {
        int left= 0;
        int right = height.length-1;
        int area = 0;
        int max = 0;
        if(right == 1){
            return Math.min(height[left],height[right]);
        }
        while(left!=right){
            int cal = Math.min(height[left],height[right]);
            area = cal*(right-left);
            max = Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }
            else{right--;
            }
        }
        return max;
    }
}