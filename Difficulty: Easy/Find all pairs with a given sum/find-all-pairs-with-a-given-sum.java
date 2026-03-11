// User function Template for Java

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

import java.util.*;

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        
        Arrays.sort(arr1);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // store frequency of elements of arr2
        for(int num : arr2){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        ArrayList<pair> list = new ArrayList<>();
        
        for(int num : arr1){
            int complement = target - num;
            
            if(map.containsKey(complement)){
                int count = map.get(complement);
                
                for(int i = 0; i < count; i++){
                    list.add(new pair(num, complement));
                }
            }
        }
        
        // convert list to array
        pair[] result = new pair[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        
        return result;
    }
}