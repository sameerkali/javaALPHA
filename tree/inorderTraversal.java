// package tree;
// import java.util.*;

// public class inorderTraversal {

//   static class Node {

//     int data;
//     Node left;
//     Node right;

//     Node(int data) {
//       this.data = data;
//       this.left = null;
//       this.right = null;
//     }
//   }

//   public static void inorder(Node root) {
//     if (root == null) return;

//     inorder(root.left);
//     System.out.println(root.data + " ");
//     inorder(root.right);
//   }

//   public static void main(String[] args) {
//     int nodes[] = { 1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//     BinaryTree tree = new BinaryTree();
//     Node root = tree.buildTree(nodes);

//     tree.inorder(root);
//   }
// }

package tree;

import java.util.*;

public class inorderTraversal {

  static class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {

    int index;

    Node buildTree(int nodes[]) {
      index = 0;
      return buildTreeFromArray(nodes);
    }

    Node buildTreeFromArray(int nodes[]) {
      if (index >= nodes.length || nodes[index] == -1) {
        index++;
        return null;
      }

      Node root = new Node(nodes[index++]);
      root.left = buildTreeFromArray(nodes);
      root.right = buildTreeFromArray(nodes);

      return root;
    }

    public void inorder(Node root) {
      if (root == null) return;

      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
    }
  }

  public static void main(String[] args) {
    int nodes[] = { 1, 2, 4, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node root = tree.buildTree(nodes);

    tree.inorder(root);
  }
}
