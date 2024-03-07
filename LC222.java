class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return countNodes(root.left) + countNodes(root.right) + 1; 
        
    }
}
// O(N), O(h)

class Solution {
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int count = 0;
        while(!que.isEmpty()){
            int size = que.size();
            while(size -- != 0){
                TreeNode cur = que.poll();
                count ++;
                if(cur.left != null) que.offer(cur.left);
                if(cur.right != null) que.offer(cur.right);
            }
        }
        return count;
    }
}
//O(N), O(N)
