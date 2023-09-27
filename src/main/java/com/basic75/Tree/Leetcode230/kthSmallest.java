package com.basic75.Tree.Leetcode230;

import com.basic75.Tree.TreeNode;

import java.util.Stack;

class Solution {

    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        int count = 0;
        while(curr != null || stack.size() !=0){
            while(curr != null){
                stack.add(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            count++;
            if(count == k) return curr.val;
            curr = curr.right;
        }
        return -1;
    }

}

public class kthSmallest {
    public static void main(String[] args){
        Solution solution = new Solution();

        TreeNode child3 = new TreeNode(2);
        TreeNode child2 = new TreeNode(1,null, child3);
        TreeNode child1 = new TreeNode(4);
        TreeNode root = new TreeNode(3, child2, child1);
        System.out.println(solution.kthSmallest(root, 1));
    }
}
