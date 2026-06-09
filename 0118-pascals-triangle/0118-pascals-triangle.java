class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();

        for(int i = 0;i<numRows;i++){
            if(i==0){
                List<Integer> innerList = new ArrayList<>();
                innerList.add(1);
                outerList.add(innerList);
                
            }
            
            else{
                List<Integer> innerList = new ArrayList<>();

                for(int j = 0;j<i;j++){
                    if(j==0){
                        innerList.add(1);
                    }
                    else{
                        int a = outerList.get(i - 1).get(j - 1) + outerList.get(i - 1).get(j);
                        innerList.add(a);
                        
                    }
                }
                innerList.add(1);
                outerList.add(innerList);
            }
            
        }
        return outerList;
    }
}