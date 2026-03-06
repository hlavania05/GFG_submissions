class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] == i + 1) {
                result.add(i + 1);
            }
        }

        return result;
        
    }
}
