class Solution {
    int search(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length-1, key);
        
    }
    int binarySearch(int[] arr, int low, int high, int key){
        if(high < low){
            return -1;
        }
        int mid = low + (high - low)/2;
        if(arr[mid] == key){
            return mid;
        }
        if(arr[low] <= arr[mid]){
            if(arr[low] <= key && key < arr[mid]){
                return binarySearch(arr, low, mid-1, key);
            }
            else{
                return binarySearch(arr, mid+1, high, key);
            }
        }
        else{
            if(arr[mid] < key && key <= arr[high]){
                return binarySearch(arr, mid+1, high, key);
            }
            else{
                return binarySearch(arr, low, mid-1, key);
            }
        }
        // return -1;
    }
}