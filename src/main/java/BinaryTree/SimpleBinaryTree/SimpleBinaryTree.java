package BinaryTree.SimpleBinaryTree;

import BinaryTree.Abstract.BinaryTree;
import BinaryTree.Abstract.BinaryTreeNode;
import BinaryTree.BinaryTreeNode.SimpleBinaryTreeNode;
import BinaryTree.Iterator.LevelOrderBinaryTreeIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleBinaryTree<T> implements BinaryTree<T> {

    BinaryTreeNode<T> root;
    Queue<BinaryTreeNode<T>> insertionQueue;

    public SimpleBinaryTree() {
        root = null;
        insertionQueue = new LinkedList<>();
    }

    @Override
    public void insert(T value) {
        if(root == null) {
            root = new SimpleBinaryTreeNode<>(value);
            insertionQueue.add(root);
            return;
        }

        BinaryTreeNode<T> insertableNode = new SimpleBinaryTreeNode<>(value);

        BinaryTreeNode<T> node = insertionQueue.peek();

        if(!node.hasLeft()) {
            node.alterLeft(insertableNode);
            insertionQueue.add(insertableNode);
            return;
        }

        if(!node.hasRight()) {
            node.alterRight(insertableNode);
            insertionQueue.add(insertableNode);
            return;
        }

        insertionQueue.poll();
        insert(value);
    }

    @Override
    public Iterator<T> iterator() {
        return new LevelOrderBinaryTreeIterator<>(root);
    }
}
