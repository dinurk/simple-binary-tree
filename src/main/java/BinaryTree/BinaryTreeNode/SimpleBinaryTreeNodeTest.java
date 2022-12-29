package BinaryTree.BinaryTreeNode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleBinaryTreeNodeTest {

    @Test
    @DisplayName("get value test")
    void valueGetting() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);
        assertEquals(1, node.value());
    }

    @Test
    @DisplayName("left and right subtree default value test")
    void leftAndRightSubtreeDefaultValue() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);

        // by default left and right nodes are null
        assertNull(node.left());
        assertNull(node.right());
    }

    @Test
    @DisplayName("left and right subtree copy test")
    void leftAndRightSubtreeCopy() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);
        BinaryTreeNode<Integer> left = new SimpleBinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right = new SimpleBinaryTreeNode<>(3);
        node.alterLeft(left);
        node.alterRight(right);

        // left and right nodes will be copied (prototype pattern)
        // in order to save tree structure
        assertNotEquals(left, node.left());
        assertNotEquals(right, node.right());
    }

    @Test
    @DisplayName("left and right subtree value test")
    void leftAndRightSubtreeValue() {
        Object value = new Object();
        Object leftValue = new Object();
        Object rightValue = new Object();

        BinaryTreeNode<Object> node = new SimpleBinaryTreeNode<>(value);
        BinaryTreeNode<Object> left = new SimpleBinaryTreeNode<>(leftValue);
        BinaryTreeNode<Object> right = new SimpleBinaryTreeNode<>(rightValue);
        node.alterLeft(left);
        node.alterRight(right);

        // values contained in left and right nodes won't be copied
        assertEquals(left.value(), node.left().value());
        assertEquals(right.value(), node.right().value());
    }
}
