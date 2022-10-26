class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int res = -1;
        
        for(int n : nums){
            if(set.contains(-n) && Math.abs(n) > res){
                res = Math.abs(n);
            }
            
            set.add(n);
        }
        
        return res;
    }
}