class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int j = 0; // position for next non-zero
        
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
                j++;
            }
        }
    }
}