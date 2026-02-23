class Solution {
    ArrayList<Integer> find(int arr[], int k) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int firstOcc = first(arr, k);
        if(firstOcc == -1){
            ans.add(-1);
            ans.add(-1);
            return ans;
        }
        int lastOcc = last(arr, k);
        ans.add(firstOcc);
        ans.add(lastOcc);
        return ans;
    }
    int first(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                idx = mid;
                high = mid-1;
            }
            else if(arr[mid] < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return idx;
    }
    int last(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == k){
                idx = mid;
                low = mid+1;
            }
            else if(arr[mid] < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return idx;
    }
    
    
}
