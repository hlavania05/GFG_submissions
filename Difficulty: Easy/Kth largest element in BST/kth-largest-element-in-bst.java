/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Solution {
    // return the Kth largest element in the given BST rooted at 'root'
    int count = 0;
    int ans = 0;
    
    public int kthLargest(Node root, int k) {
        // Your code here
        
        helper(root, k);
        return ans;
    }
    public void helper(Node root, int k){
        if(root == null){
            return;
            
        }
        helper(root.right, k);
        count++;
        if(count == k){
            ans = root.data;
            return;
        }
        helper(root.left, k);
    }
}