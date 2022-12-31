package BinaryTree.Iterator;

import BinaryTree.Abstract.BinaryTreeNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class LevelOrderBinaryTreeIterator<T> implements Iterator<T> {

    private final Queue<BinaryTreeNode<T>> levelOrderTraversalQueue;

    public LevelOrderBinaryTreeIterator(BinaryTreeNode<T> root) {
        levelOrderTraversalQueue = new LinkedList<>();
        if(root != null) {
            levelOrderTraversalQueue.add(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !levelOrderTraversalQueue.isEmpty();
    }

    @Override
    public T next() {

        if(levelOrderTraversalQueue.isEmpty()) {
            throw new NoSuchElementException("requested element does not exist");
        }

        BinaryTreeNode<T> nodeWithResult = levelOrderTraversalQueue.poll();

        if(nodeWithResult.hasLeft()) {
            levelOrderTraversalQueue.add(nodeWithResult.left());
        }
        if(nodeWithResult.hasRight()) {
            levelOrderTraversalQueue.add(nodeWithResult.right());
        }

        return nodeWithResult.value();
    }
}
