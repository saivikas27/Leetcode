package com.basic75.Tree.Leetcode102;

import com.basic75.Tree.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;


class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return finalList;
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0; i<len; i++){
                TreeNode value = queue.poll();
                if(value != null) {
                    list.add(value.val);
                    queue.add(value.left);
                    queue.add(value.right);
                }
            }
            if(list.size() > 0)finalList.add(list);
            list = new ArrayList<>();
        }
        return finalList;
    }
}

public class BTLevelOrderTraversal {

    public static void main(String[] args){
        Solution solution = new Solution();
        TreeNode v15 = new TreeNode(15);
        TreeNode v7 = new TreeNode(7);
        TreeNode v20 = new TreeNode(20, v15, v7);
        TreeNode v9 = new TreeNode(9);
        TreeNode root = new TreeNode(3, v9, v20);
        System.out.println(solution.levelOrder(root));
    }
}
