/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
         Map<Integer,TreeNode> parent = new HashMap<>();
        buildParent(root, null, parent);  // ① Phase 1: record each node's parent

        List<Integer> res = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(target); seen.add(target.val);

        for (int dist = 0; !q.isEmpty(); dist++) {  // ② dist tracks current BFS depth
            if (dist == k) {                         // ③ reached target depth — collect all
                q.forEach(n -> res.add(n.val));
                break;
            }
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                TreeNode cur = q.poll();
                TreeNode par = parent.get(cur.val);  // ④ get parent from map
                for (TreeNode nb : new TreeNode[]{cur.left, cur.right, par}) {
                    if (nb != null && seen.add(nb.val)) // ⑤ 3 neighbours: left, right, parent
                        q.offer(nb);
                }
            }
        }
        return res;
        
    }
    private void buildParent(TreeNode node,
                             TreeNode parentNode,
                             Map<Integer, TreeNode> parent) {

        if (node == null) return;

        // Store this node's parent
        parent.put(node.val, parentNode);

        // Recurse left — node is the parent of node.left
        buildParent(node.left, node, parent);

        // Recurse right — node is the parent of node.right
        buildParent(node.right, node, parent);
    }



}