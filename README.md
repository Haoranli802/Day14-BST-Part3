# Day14-BST-Part3
104.二叉树的最大深度  

递归：叶节点为0，然后返回max + 1。记得space complexity是O（height）

迭代：用que然后用一个int来keep track height。

559. n叉树的最大深度

跟104一样套路，不过递归对比的时候记得将current max设为0。

记得递归space complexity是O（height）。

111.二叉树的最小深度

迭代：层序遍历，找到第一个左右节点都为null的子节点。

递归：要处理左右节点为null的情况然后return min就可以。

222.完全二叉树的节点个数
