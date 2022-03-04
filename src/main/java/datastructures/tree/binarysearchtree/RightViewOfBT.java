package datastructures.tree.binarysearchtree;

import java.util.HashMap;
import java.util.List;

public class RightViewOfBT {
//
//  HashMap<Integer, Integer> map = new HashMap<>();
//
//  public List<Integer> rightSideView(TreeNode root) {
//    List<Integer> list = new ArrayList<>();
//
//    if(root == null) return list;
//
//    bfs(root, 0);
//    list.addAll(map.values());
//
//    return list;
//  }
//
//  public void bfs(TreeNode node, int dep) {
//    if(node == null) return;
//
//    // Treversal the tree from left to right -> So the last node in current depth is our "right side view"
//    map.put(dep, node.val);
//
//    bfs(node.left, dep + 1);
//    bfs(node.right, dep + 1);
//  }
}
