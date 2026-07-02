class Solution {
    public int[][] merge(int[][] intervals) {
        int size = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        int arr[][] = new int[size][2];
        int pointer =0 ;
        arr[0] = intervals[0];
        for(int i = 1;i<size;i++){
            if(arr[pointer][1]>= intervals[i][0] && arr[pointer][1]<=intervals[i][1]){
                arr[pointer][1] = intervals[i][1];
            }
            else if(arr[pointer][1]>=intervals[i][1]){
                continue;
            }
            else{
                pointer++;
                arr[pointer] = intervals[i];
            }
        }
        
        
               return Arrays.copyOf(arr, pointer + 1);

    }
}