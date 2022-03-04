package datastructures.tree.binarysearchtree;

//     9
//  4     20
//1  6  15  170

import java.util.ArrayList;

public class BST {

  Node root;

  public BST(int value) {
    this.root = new Node(value);
  }

  public void insert(int value) {

    Node newNode = new Node(value);
    Node current = root;

    while(true) {
      // Right
      if(value > current.value) {
        if(current.right == null) {
          current.right = newNode;
          break;
        } else {
          current = current.right;
        }
      }
      // Left
      if(value < current.value) {
        if(current.left == null) {
          current.left = newNode;
          break;
        } else {
          current = current.left;
        }
      }
    }
  }

  public boolean lookup(int value) {

    if(this.root.value == value) {
      return true;
    }

    Node current = root;

    while(current != null) {
      if(value > current.value) {
        current = current.right;
      } else if(value < current.value) {
        current = current.left;
      } else if(value == current.value) {
        return true;
      }
    }

    return false;
  }

  /**
  BFS implemented iteratively
   */
  public ArrayList<Integer> breadthFirstSearch() {
    Node currentNode = this.root;
    ArrayList<Integer> result = new ArrayList<>();
    ArrayList<Node> queue = new ArrayList<>();
    queue.add(currentNode);

    while (queue.size() != 0) {
      currentNode = queue.remove(0);
      result.add(currentNode.value);

      if(currentNode.left != null) {
        queue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        queue.add(currentNode.right);
      }
    }

    return result;
  }

  /**
   BFS implemented recursively
   */
  public ArrayList<Integer> breadthFirstSearchRecursive(ArrayList<Node> queue, ArrayList<Integer> result) {
    if(queue.size() == 0) {
      return result;
    }

    Node currentNode = queue.remove(0);
    result.add(currentNode.value);

    if(currentNode.left != null) {
      queue.add(currentNode.left);
    }
    if (currentNode.right != null) {
      queue.add(currentNode.right);
    }

    return breadthFirstSearchRecursive(queue, result);
  }

  /**
   DFS Traversals - InOrder, PreOrder and Postorder
   */

  DFSTraversal dfsTraversal = new DFSTraversal();

  // DFS InOrder
  public ArrayList<Integer> dfsInOrder() {
    ArrayList<Integer> answer = new ArrayList<>();
    return dfsTraversal.traverseInOrder(this.root, answer);
  }

  // DFS PreOrder
  public ArrayList<Integer> dfsPreOrder() {
    ArrayList<Integer> answer = new ArrayList<>();
    return dfsTraversal.traversePreOrder(this.root, answer);
  }

  // DFS PostOrder
  public ArrayList<Integer> dfsPostOrder() {
    ArrayList<Integer> answer = new ArrayList<>();
    return dfsTraversal.traversePostOrder(this.root, answer);
  }

  public Node traverse(Node node) {
    Node treeNode = new Node(node.value);
    System.out.print("node = " + node.value);
    treeNode.left = node.left == null ? null : traverse(node.left);
    treeNode.right = node.right == null ? null : traverse(node.right);
    return treeNode;
  }

  public boolean isValidBST(Node node){
    if(node==null)
      return true;

    if(node.left == null && node.right == null) {
      return true;
    }

    if(node.left != null && node.right == null) {
      if (node.value > node.left.value) {
        return true;
      }
    }

    if(node.left == null && node.right != null) {
      if (node.value < node.right.value) {
        return true;
      }
    }

    if(node.left != null && node.right != null) {
      if ((node.value > node.left.value) && (node.value < node.right.value)) {
        return true;
      }
    }

    return isValidBST(node.left) && isValidBST(node.right);
  }

  public static void main(String[] args) {
    BST bst = new BST(9);
    bst.insert(4);
    bst.insert(20);
    bst.insert(1);
    bst.insert(6);
    bst.insert(15);
    bst.insert(170);

    // Traversal of nodes
//    bst.traverse(bst.root);

    // Lookup a node
    System.out.println("Lookup 17 -> " + bst.lookup(17));

    // BFS - Iterative
    System.out.println("Breadth First Search iteratively -> " + bst.breadthFirstSearch());

    // BFS Recursive
    ArrayList<Node> queue = new ArrayList<>();
    queue.add(bst.root);
    System.out.println("Breadth First Search recursively -> " + bst.breadthFirstSearchRecursive(queue, new ArrayList<>()));

    //DFS InOrder
    System.out.println("DFS InOrder -> " + bst.dfsInOrder());
    System.out.println("DFS PreOrder -> " + bst.dfsPreOrder());
    System.out.println("DFS PostOrder -> " + bst.dfsPostOrder());

    System.out.println(bst.isValidBST(bst.root));
  }
}
