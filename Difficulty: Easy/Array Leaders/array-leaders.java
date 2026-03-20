import java.util.*;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int[] dummy = new int[n];
        dummy[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            dummy[i] = Math.max(arr[i], dummy[i+1]);
        } 
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        
        for(int i=0; i<n; i++){
            if(arr[i] >= dummy[i]){
                ans.add(arr[i]);
            }
        }
        return ans;
    }
}
