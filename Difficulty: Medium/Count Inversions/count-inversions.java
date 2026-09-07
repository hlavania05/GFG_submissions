class Solution {
    public int inversionCount(int arr[]) {
        // code here
        return mergeSort(arr, 0, arr.length-1);
    }
    public int mergeSort(int[] arr, int low, int high){
        if(low >= high){
            return 0;
        }
        int cnt = 0;
        
        int mid = low + (high-low)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }
    
    public int merge(int[] arr, int low, int mid, int high){
        int left = low; 
        int right = mid+1;
        
        int[] temp = new int[high-low+1];
        int k = 0;
        int cnt = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k] = arr[left];
                left++;
                k++;
            }
            else{
                temp[k] = arr[right];
                cnt += (mid-left+1);
                right++;
                k++;
            }
        }
        
        while(left <= mid){
            temp[k] = arr[left];
            left++;
            k++;
        }
        while(right <= high){
            temp[k] = arr[right];
            right++;
            k++;
        }
        
        for(int i=0; i<temp.length; i++){
            arr[low+i] = temp[i];
        }
        return cnt;
    }
}