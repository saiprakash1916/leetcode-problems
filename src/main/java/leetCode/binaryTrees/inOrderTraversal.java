package leetCode.binaryTrees;

import java.util.ArrayList;
import java.util.List;

/*
    Leet Code Problem No: 94. Binary Tree Inorder Traversal
    Given the root of a binary tree, return the inorder traversal of its nodes' values.

    Input: root = [1,null,2,3]

    Output: [1,3,2]
 */
public class inOrderTraversal {
    static List<Integer> checkingInOrder(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list;
    }

    // Left -> Root -> Right
    static void inOrder(TreeNode node,  ArrayList<Integer> list){
        if(node == null) return;
        inOrder(node.left, list);
        list.add(node.val);
        inOrder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = null;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);

        List<Integer> result = checkingInOrder(node);
        System.out.println(result);
    }
}
