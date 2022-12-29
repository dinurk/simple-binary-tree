package BinaryTree.BinaryTree;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleBinaryTreeTest {

    @Test
    @DisplayName("insert test")
    void insert() {
        BinaryTree<Integer> tree = new SimpleBinaryTree<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);

        Iterator<Integer> iter = tree.iterator();

        assertEquals(1, iter.next());
        assertEquals(2, iter.next());
        assertEquals(3, iter.next());
    }
}
