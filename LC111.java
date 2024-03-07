class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return minDepth(root.right) + 1;
        if(root.right == null) return minDepth(root.left) + 1;
        return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
//O(N), O(h)

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        int height = 0;
        while(!que.isEmpty()){
            int size = que.size();
            height ++;
            while(size -- != 0){
                TreeNode cur = que.poll();
                if(cur.left == null && cur.right == null) return height;
                if(cur.left != null) que.offer(cur.left);
                if(cur.right != null) que.offer(cur.right); 
            }
        }
        return height;
    }
}
//O(N), O(N)
