class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        int[] freq = new int[n+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int item : arr){
            freq[item]++;
            if(freq[item] > 1){
                ans.add(item);
            }
            
        }
        return ans;
    }
}