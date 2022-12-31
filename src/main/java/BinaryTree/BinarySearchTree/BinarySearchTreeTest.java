package BinaryTree.BinarySearchTree;

import BinaryTree.Abstract.BinaryTree;
import BinaryTree.Comparator.IntegerComparator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

public class BinarySearchTreeTest {

    @Test
    @DisplayName("insert value test")
    void insert() {
        BinaryTree<Integer> tree = new BinarySearchTree<>(new IntegerComparator());
        tree.insert(5);
        tree.insert(-2);
        tree.insert(7);
        tree.insert(44);
        tree.insert(9);
        tree.insert(-3);

        Iterator<Integer> iter = tree.iterator();
        assertEquals(-3, iter.next());
        assertEquals(-2, iter.next());
        assertEquals(5, iter.next());
        assertEquals(7, iter.next());
        assertEquals(9, iter.next());
        assertEquals(44, iter.next());
    }
}
