package datastructures.tree.binarysearchtree;

import java.util.ArrayList;

public class DFSTraversal {

  public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> answer) {

    if(node.left != null) {
      traverseInOrder(node.left, answer);
    }

    answer.add(node.value);

    if(node.right != null) {
      traverseInOrder(node.right, answer);
    }

    return answer;
  }

  public ArrayList<Integer> traversePreOrder(Node node, ArrayList<Integer> answer) {

    answer.add(node.value);

    if(node.left != null) {
      traversePreOrder(node.left, answer);
    }

    if(node.right != null) {
      traversePreOrder(node.right, answer);
    }

    return answer;
  }

  public ArrayList<Integer> traversePostOrder(Node node, ArrayList<Integer> answer) {

    if(node.left != null) {
      traversePostOrder(node.left, answer);
    }

    if(node.right != null) {
      traversePostOrder(node.right, answer);
    }

    answer.add(node.value);

    return answer;
  }
}
