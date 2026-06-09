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
        List<Integer> ans = new ArrayList<>();
        int temp = calcDistance(root, target, k, ans);
        return ans;
    }

    int calcDistance(TreeNode root, TreeNode target, int k, List<Integer> ans) {
        if(root == null)    return -1;

        if(root == target) {
            checkSubtree(root, k, ans);
            return 0;
        }
        int dl = calcDistance(root.left, target, k, ans);
        if(dl != -1) {
            if(dl + 1 == k) {
                ans.add(root.val);
            } else {
                checkSubtree(root.right, k - dl - 2, ans);
            }
            return dl + 1;
        }
        int dr = calcDistance(root.right, target, k, ans);
        if(dr != -1){
            if(dr + 1 == k) {
                ans.add(root.val);
            } else {
                checkSubtree(root.left, k - dr - 2, ans);
            }
            return dr + 1;
        }
        return -1;
    }

    void checkSubtree(TreeNode root, int k, List<Integer> ans) {
        if(root == null || k < 0)
            return;
        if(k == 0) {
            ans.add(root.val);
        }
        checkSubtree(root.left, k-1, ans);
        checkSubtree(root.right, k-1, ans);
    }
}