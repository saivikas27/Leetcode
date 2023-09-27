package com.basic75.Tree.LeetCode226;


import com.basic75.Tree.TreeNode;

class Solution {
    public void invert(TreeNode root){
        if(root == null) return;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }
}

public class InvertBinaryTree {

    public static void main(String[] args) {
        TreeNode rightChild = new TreeNode(2);
        TreeNode leftChild = new TreeNode(1);
        TreeNode root = new TreeNode(3, leftChild, rightChild);
        Solution solution = new Solution();
        solution.invert(root);
    }

}
