class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root, lastRightNode = null;

        while (!stack.isEmpty() || currentNode != null) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

         
            currentNode = stack.peek();

      
            if (currentNode.right != lastRightNode && currentNode.right != null) {
                currentNode = currentNode.right;
                continue; 
            }

            stack.pop();

         
            if (currentNode.right == null && currentNode.left == null && currentNode.val == target) {
                if (stack.isEmpty()) {
                    return null; 
                }
                
                TreeNode parent = stack.isEmpty() ? null : stack.peek();

                if (parent != null) {
                    if (parent.left == currentNode) {
                        parent.left = null; 
                    } else {
                        parent.right = null; 
                    }
                }
            }

            lastRightNode = currentNode;
            currentNode = null;
        }
        return root; 
        }
}