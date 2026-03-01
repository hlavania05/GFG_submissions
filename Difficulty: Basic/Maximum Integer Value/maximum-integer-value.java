// User function Template for Java

class Solution {
    long MaximumIntegerValue(String S) {
        // code here
        long max = Integer.MIN_VALUE;
        for(char ch : S.toCharArray()){
            int n = ch - '0';
            if(max == Integer.MIN_VALUE){
                max = n;
            } 
            else{
                max = Math.max(max*n, max+n);
            }
            
        }
        return max;
    }
}