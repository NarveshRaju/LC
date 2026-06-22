class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> mp = new HashMap<>(); 
        for(char a : text.toCharArray())
            mp.put(a,mp.getOrDefault(a,0)+1);
        
        return Math.min(Math.min(Math.min((mp.getOrDefault('b',0)),mp.getOrDefault('a',0)),Math.min(mp.getOrDefault('l',0)/2,mp.getOrDefault('o',0)/2)),mp.getOrDefault('n',0));
    }
}