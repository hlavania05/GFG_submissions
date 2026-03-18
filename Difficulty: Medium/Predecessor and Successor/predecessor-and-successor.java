/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        
        ArrayList<Node> ans = new ArrayList<>();
        ans.add(pre(root, key));
        ans.add(suc(root, key));
        return ans;
        
    }
    public Node pre(Node root, int key){
        Node pre = null;
        
        while(root != null){
            if(root.data < key){
                pre = root;
                root = root.right;
            }
            else if(root.data > key){
                root = root.left;
            }
            else{
                if(root.left != null){
                    Node temp = root.left;
                    while(temp.right != null){
                        temp = temp.right;
                    }
                    pre = temp;
                }
                break;
            }
        }
        return pre;
    }
    public Node suc(Node root, int key){
        Node suc = null;
        while(root != null){
            if(root.data > key){
                suc = root;
                root = root.left;
            }
            else if(root.data < key){
                root = root.right;
            }
            else{
                if(root.right != null){
                    Node temp = root.right;
                    while(temp.left != null){
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            }
        }
        return suc;
    }
}