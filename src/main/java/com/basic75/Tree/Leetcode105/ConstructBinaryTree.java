package com.basic75.Tree.Leetcode105;

import com.basic75.Tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    public TreeNode splitTree(int[] preorder, Map<Integer, Integer> map, int curr, int start, int end) {
        int val = preorder[curr];
        int order = map.get(val);
        TreeNode root = new TreeNode(val);
        if (order > start) root.left = splitTree(preorder, map, curr + 1, start, order - 1);
        if (order < end) root.right = splitTree(preorder, map, curr + order - start + 1, order + 1, end);
        return root;
    }
}

public class ConstructBinaryTree {

    public static void main(String[] args){
        int[] preorder = {3,9,20,15,7};
        int[] inorder ={9,3,15,20,7};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<preorder.length; i++) map.put(inorder[i],i);
        Solution solution = new Solution();
        TreeNode root = solution.splitTree(preorder, map, 0, 0, preorder.length-1);
        System.out.println("Root val is "+root.val);
    }
}
