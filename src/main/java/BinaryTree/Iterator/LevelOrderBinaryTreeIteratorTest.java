package BinaryTree.Iterator;

import BinaryTree.Abstract.BinaryTreeNode;
import BinaryTree.BinaryTreeNode.SimpleBinaryTreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class LevelOrderBinaryTreeIteratorTest {

    @Test
    @DisplayName("level order binary tree iteration test")
    void levelOrderBinaryTreeIteration() {
        BinaryTreeNode<Integer> root = new SimpleBinaryTreeNode<>(1);

        // level 1
        BinaryTreeNode<Integer> left1 = new SimpleBinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right1 = new SimpleBinaryTreeNode<>(3);

        // level 2
        BinaryTreeNode<Integer> left2 = new SimpleBinaryTreeNode<>(4);
        BinaryTreeNode<Integer> right2 = new SimpleBinaryTreeNode<>(5);

        root.alterLeft(left1);
        root.alterRight(right1);
        left1.alterLeft(left2);
        left1.alterRight(right2);

        Iterator<Integer> iter = new LevelOrderBinaryTreeIterator<>(root);

        assertTrue(iter.hasNext());
        assertEquals(1, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(2, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(3, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(4, iter.next());
        assertTrue(iter.hasNext());
        assertEquals(5, iter.next());

        assertFalse(iter.hasNext());
        assertThrows(NoSuchElementException.class, () -> iter.next());
    }

    @Test
    @DisplayName("empty tree iteration test")
    void emptyTreeIteration() {
        Iterator<Integer> iter = new LevelOrderBinaryTreeIterator<>(null);
        assertFalse(iter.hasNext());
        assertThrows(NoSuchElementException.class, () -> iter.next());
    }
}
