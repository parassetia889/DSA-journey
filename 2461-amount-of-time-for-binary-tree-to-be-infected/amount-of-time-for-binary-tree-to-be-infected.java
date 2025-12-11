
class Solution {
    public int amountOfTime(TreeNode root, int start) {

    Map<TreeNode, TreeNode> parent = new HashMap<>();
    fetchParentMapping(root, parent);

    TreeNode startNode = fetchStartNode(root, start);

    Queue<TreeNode> q = new LinkedList<>();
    q.offer(startNode);

    Set<TreeNode> visited = new HashSet<>();
    visited.add(startNode);

    int minutes = 0;

    while(!q.isEmpty()){
        int size = q.size();
        boolean burntThisMinute = false;

        while(size-- > 0){
            TreeNode node = q.poll();

            // left
            if(node.left != null && !visited.contains(node.left)){
                visited.add(node.left);
                q.offer(node.left);
                burntThisMinute = true;
            }

            // right
            if(node.right != null && !visited.contains(node.right)){
                visited.add(node.right);
                q.offer(node.right);
                burntThisMinute = true;
            }

            // parent
            if(parent.containsKey(node)){
                TreeNode p = parent.get(node);
                if(!visited.contains(p)){
                    visited.add(p);
                    q.offer(p);
                    burntThisMinute = true;
                }
            }
        }

        if(burntThisMinute) minutes++;
    }

    return minutes;
}


    public TreeNode fetchStartNode(TreeNode root, int start) {

    if (root == null || root.val == start) return root;

    TreeNode left = fetchStartNode(root.left, start);
    if (left != null) return left;

    return fetchStartNode(root.right, start);
}


    public void fetchParentMapping(TreeNode root,  Map<TreeNode, TreeNode> parentMapping ){
        if(root == null)
            return;

        if(root.left != null){
            parentMapping.put(root.left, root);
            fetchParentMapping(root.left, parentMapping);
        }

        if(root.right != null){
            parentMapping.put(root.right, root);
            fetchParentMapping(root.right, parentMapping);
        }
    }
}