class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int result = 0;
        for(Node n : root.children){
            result = Math.max(result, maxDepth(n));
        }
        return result + 1;
    }
}
//O(N), O(h)
