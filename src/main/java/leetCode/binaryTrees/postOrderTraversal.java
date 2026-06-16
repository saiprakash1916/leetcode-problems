package leetCode.binaryTrees;

/*
    Leet Code Problem No: 145. Binary Tree Postorder Traversal

    Given the root of a binary tree, return the postorder traversal of its nodes' values.
    Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

    Output: [4,6,7,5,2,9,8,3,1]
 */

import java.util.ArrayList;
import java.util.List;

public class postOrderTraversal {
    static List<Integer> checkingPostOrder(TreeNode node){
        ArrayList<Integer> list = new ArrayList<>();
        postOrder(node, list);
        return list;
    }

    //Left -> Right -> Root
    static void postOrder(TreeNode node, ArrayList<Integer> list){
        if(node == null) return;
        postOrder(node.left, list);
        postOrder(node.right, list);
        list.add(node.val);
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

        List<Integer> result = checkingPostOrder(node);
        System.out.println(result);
    }
}
