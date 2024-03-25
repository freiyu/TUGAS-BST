package tugas6_BinarySearchTree;

public class BinarySearchTree {
  Node root;
  
  public boolean insert(int value) {
    Node newNode = new Node(value);
    
    if (root == null) {
      root = newNode;
    }
    
    Node current = root;
    while (true) {
      if (value < current.value) {
        if (current.left == null) {
          current.left = newNode;
          return true;
        } else {
          current = current.left;
        }
      } else if (value > current.value) {
        if (current.right == null) {
          current.right = newNode;
          return true;
        } else {
          current = current.right;
        }
      } else {
        return false;
      }
    }
    
  }
  
  public void contains(int value) {
    System.out.println("Searching...");
    
    Node current = root;
    while (current != null) {
      if (value > current.value) {
        System.out.printf("Right node: %d \n", current.value);
        current = current.right;
      } else if (value < current.value) {
        System.out.printf("Left node: %d \n", current.value);
        current = current.left;
      } else {
        System.out.printf("Yes, %d exist in the tree", value);
        return;
      }
    }
    
    System.out.printf("No, %d doesn't exist in the tree", value);
  }
}
