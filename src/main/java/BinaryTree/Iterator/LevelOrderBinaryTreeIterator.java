package BinaryTree.Iterator;

import BinaryTree.BinaryTreeNode.BinaryTreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LevelOrderBinaryTreeIterator<T> implements Iterator<T> {

    private final Queue<BinaryTreeNode<T>> levelOrderTraversalStack;

    public LevelOrderBinaryTreeIterator(BinaryTreeNode<T> root) {
        levelOrderTraversalStack = new LinkedList<>();
        if(root != null) {
            levelOrderTraversalStack.add(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !levelOrderTraversalStack.isEmpty();
    }

    @Override
    public T next() {

        if(levelOrderTraversalStack.isEmpty()) {
            throw new NoSuchElementException("requested element does not exist");
        }

        BinaryTreeNode<T> nodeWithResult = levelOrderTraversalStack.poll();

        if(nodeWithResult.hasLeft()) {
           levelOrderTraversalStack.add(nodeWithResult.left());
        }
        if(nodeWithResult.hasRight()) {
            levelOrderTraversalStack.add(nodeWithResult.right());
        }

        return nodeWithResult.value();
    }
}
