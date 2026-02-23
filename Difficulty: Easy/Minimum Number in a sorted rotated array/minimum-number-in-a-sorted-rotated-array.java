class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        minValue = Integer.MAX_VALUE;
        find(arr, low, high);
        return minValue;
        
    }
    static int minValue = Integer.MAX_VALUE;
    static public void find(int[] arr, int low, int high){
        if(low > high){
            return;
        }
        int mid = low + (high-low)/2;
        if(arr[low] <= arr[mid]){
            minValue = Math.min(minValue, arr[low]);
            find(arr, mid+1, high);
        }
        else{
            minValue = Math.min(minValue, arr[mid]);
            find(arr, low, mid-1);
        }
    }
}