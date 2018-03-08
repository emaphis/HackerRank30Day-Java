/*
 * Hacker Rank Day 23 - Java
 * Review, Binary Search Tree - Challenge
 */
package day_23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {


    static void levelOrder(Node root){
      //Write your code here
        Queue<Node> temp = new LinkedList();
        temp.add(root);
        while (!temp.isEmpty()) {
            Node node = temp.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                temp.add(node.left);
            }
            if (node.right != null) {
                temp.add(node.right);
            }
        }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }	

}
