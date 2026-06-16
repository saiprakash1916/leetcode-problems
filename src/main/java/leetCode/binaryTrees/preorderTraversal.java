package leetCode.binaryTrees;

import java.util.ArrayList;
import java.util.List;

/*
    Leet Code Problem No: 144. Binary Tree Preorder Traversal

    Given the root of a binary tree, return the preorder traversal of its nodes' values.
    Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

    Output: [1,2,4,5,6,7,3,8,9]
 */
public class preorderTraversal {
    static List<Integer> checkingPreOrder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;
    }

    // Root -> Left -> Right
    static void preOrder(TreeNode node, ArrayList<Integer> list) {
        if (node == null) return;
        list.add(node.val);
        preOrder(node.left, list);
        preOrder(node.right, list);
    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(4);
        node.left.right = new TreeNode(5);
        node.left.right.left = new TreeNode(6);
        node.left.right.right = new TreeNode(7);
        node.right = new TreeNode(3);
        node.right.right = new TreeNode(8);
        node.right.right.left = new TreeNode(9);

        List<Integer> result = checkingPreOrder(node);
        System.out.println(result);
    }
}
