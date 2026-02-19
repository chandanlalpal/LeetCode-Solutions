import java.util.*;

public class find_leave_of_Binary_Tree {

    // Definition for binary tree node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // You will implement this method
    public List<List<Integer>> findLeaves(TreeNode root) {

        // WRITE YOUR LOGIC HERE
        List<List<Integer>>ans=new ArrayList<>();
        TreeMap<Integer,List<Integer>>map=new TreeMap<>();
        dfs(root,map);

        for(List<Integer>it:map.values()){
            ans.add(it);
        }
        return ans; // change this
    }

    // Helper DFS method (you can use or modify)
    private int dfs(TreeNode node, TreeMap<Integer, List<Integer>> map) {
        if (node == null) return 0;

        int left = dfs(node.left, map);
        int right = dfs(node.right, map);

        int height = 1 + Math.max(left, right);

        map.putIfAbsent(height, new ArrayList<>());
        map.get(height).add(node.val);

        return height;
    }

    public static void main(String[] args) {

        find_leave_of_Binary_Tree obj = new find_leave_of_Binary_Tree();

        // Example tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Call your method
        List<List<Integer>> result = obj.findLeaves(root);

        System.out.println(result);
    }
}

