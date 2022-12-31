package BinaryTree.BinaryTreeNode;

import BinaryTree.Abstract.BinaryTreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleBinaryTreeNodeTest {

    @Test
    @DisplayName("get value test")
    void getValue() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);
        assertEquals(1, node.value());
    }

    @Test
    @DisplayName("left and right subtree default value test")
    void leftAndRightSubtreeDefaultValue() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);

        assertNull(node.left());
        assertNull(node.right());
    }

    @Test
    @DisplayName("left and right subtree get test")
    void leftAndRightSubtreeGet() {
        BinaryTreeNode<Integer> node = new SimpleBinaryTreeNode<>(1);
        BinaryTreeNode<Integer> left = new SimpleBinaryTreeNode<>(2);
        BinaryTreeNode<Integer> right = new SimpleBinaryTreeNode<>(3);
        node.alterLeft(left);
        node.alterRight(right);

        assertEquals(left, node.left());
        assertEquals(right, node.right());
    }

    @Test
    @DisplayName("left and right subtree value get test")
    void leftAndRightSubtreeValueGet() {
        Object value = new Object();
        Object leftValue = new Object();
        Object rightValue = new Object();

        BinaryTreeNode<Object> node = new SimpleBinaryTreeNode<>(value);
        BinaryTreeNode<Object> left = new SimpleBinaryTreeNode<>(leftValue);
        BinaryTreeNode<Object> right = new SimpleBinaryTreeNode<>(rightValue);
        node.alterLeft(left);
        node.alterRight(right);

        assertEquals(left.value(), node.left().value());
        assertEquals(right.value(), node.right().value());
    }
}
