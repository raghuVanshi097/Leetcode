class Solution {
    public boolean isValid(int n1, int n2){
        
        String rev = new StringBuilder().append(n2).reverse().toString();
        return n1 == Integer.parseInt(rev);
    }
    
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i <= num/2; i++){
            if(isValid(i, num - i)){
                return true;
            }
        }
        
        return false;
    }
}