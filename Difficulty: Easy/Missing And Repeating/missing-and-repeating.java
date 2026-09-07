class Solution {
    ArrayList<Integer> findTwoElement(int nums[]) {
        // code here
        int n = nums.length;
        int[] temp = new int[n+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<n; i++){
            int num = nums[i];
            if(temp[num] != 0){
                ans.add(num);
            }
            temp[num] = 1;
        }
        for(int i=1; i<temp.length; i++){
            if(temp[i] == 0){
                ans.add(i);
                break;
            }
        }
        return ans;
    }
}
