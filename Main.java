package tugas6_BinarySearchTree;

public class Main {
    public static void main(String[] args) {

        BinarySearchTree myBST = new BinarySearchTree();

        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);


        System.out.println("Dose BST contain 27?");
        myBST.contains(27);

        System.out.println();

        System.out.println("\nDoes BST contain 17?");
        myBST.contains(17);
    }
}
