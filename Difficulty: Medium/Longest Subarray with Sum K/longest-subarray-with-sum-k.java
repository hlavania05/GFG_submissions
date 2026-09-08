class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Long, Integer> map = new HashMap<>();
        int maxLen = 0;
        long prefixSum = 0;
        map.put(0L, -1);
        
        for(int i=0; i<arr.length; i++){
            prefixSum += arr[i];
            long rem = prefixSum - k;
            
            
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                maxLen = Math.max(maxLen, i-idx);
            }
            if(!map.containsKey(prefixSum)){
                map.put(prefixSum, i);
            }
        }
        return maxLen;
    }
}
