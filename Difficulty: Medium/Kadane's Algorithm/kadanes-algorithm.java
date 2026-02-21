

// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        int sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        for(int item : arr){
            curr_sum += item;
            sum = Math.max(sum, curr_sum);
            if(curr_sum < 0){
                curr_sum = 0;
            }
        }
        return sum;
    }
}