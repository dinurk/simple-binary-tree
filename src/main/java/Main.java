import BinaryTree.BinaryTree.BinaryTree;
import BinaryTree.BinaryTree.SimpleBinaryTree;

import java.util.Iterator;

public class Main {
    public static void main(String ...args) {
        BinaryTree<Integer> tree = new SimpleBinaryTree<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);

        Iterator<Integer> iter = tree.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next().toString());
        }
    }
}