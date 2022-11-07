package extra;

//import com.sun.source.tree.BinaryTree;
import java.util.ArrayList;

public class SampleBT {

  public static void main(String[] args) {
    SampleBT test = new SampleBT();

    test.solution();
  }

  private void solution() {

    Node tree = new Node(20);
//    tree.root = new Node(20);
    tree.left = new Node(8);
    tree.left.left = new Node(4);
    tree.left.right = new Node(12);
    tree.left.right.left = new Node(10);
    tree.left.right.right = new Node(14);
    tree.right = new Node(22);
    tree.right.right = new Node(25);

    ArrayList<Integer> arrayList = new ArrayList<>();

    traverse(tree, arrayList);

    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
  }

//  public void insertNode(int value, Node root) {
//    Node current = traverse(root);
//    Node newNode = new Node(value);
//
//    if(value > current.value) {
//      current.right = newNode;
//    }
//    if(value < current.value) {
//      current.left = newNode;
//    }
//  }



  private Node traverse(Node root, ArrayList arrayList) {
    Node current = root;

    if(current.left != null) {
      traverse(current.left, arrayList);
    }

    arrayList.add(current.value);

    if (current.right != null) {
      traverse(current.right, arrayList);
    }

    return current;
  }
}
