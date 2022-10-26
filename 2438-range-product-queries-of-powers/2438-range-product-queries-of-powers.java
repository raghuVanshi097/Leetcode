class Solution {
    public int[] productQueries(int n, int[][] queries) {
        String str = Integer.toBinaryString(n);
        
        ArrayList<Long> powers = new ArrayList<>();
        
        long pow = 1;
        
        for (int i = str.length() - 1; i >= 0; i--) { 
            if (str.charAt(i) == '1') {
                powers.add(pow); 
            }
            pow = pow * 2;
        }

        int[] res = new int[queries.length];
        Arrays.fill(res, 1);

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                res[i] = (int)((res[i] * powers.get(j)) % ((int) 1e9 + 7));
            }
        }

        return res;
    }
}