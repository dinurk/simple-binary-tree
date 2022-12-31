package BinaryTree.BinarySearchTree;

import BinaryTree.Abstract.BinaryTree;
import BinaryTree.Abstract.BinaryTreeNode;
import BinaryTree.BinaryTreeNode.SimpleBinaryTreeNode;
import BinaryTree.Iterator.InOrderIterator;

import java.util.Comparator;
import java.util.Iterator;

public class BinarySearchTree<T> implements BinaryTree<T> {

    private BinaryTreeNode<T> root;
    private final Comparator<T> comparator;

    public BinarySearchTree(Comparator<T> comparator) {
        root = null;
        this.comparator = comparator;
    }

    @Override
    public void insert(T value)  {
        if(root == null) {
            root = new SimpleBinaryTreeNode<>(value);
            return;
        }

        BinaryTreeNode<T> currentNode = root;
        BinaryTreeNode<T> insertableNode = new SimpleBinaryTreeNode<>(value);

        final int ITERATIONS_LIMIT = 5000;
        for(int i = 0; i < ITERATIONS_LIMIT; i++) {
            if(comparator.compare(value, currentNode.value()) < 0) {
                if(currentNode.hasLeft()) {
                    currentNode = currentNode.left();
                    continue;
                }
                currentNode.alterLeft(insertableNode);
                return;
            }

            if(currentNode.hasRight()) {
                currentNode = currentNode.right();
                continue;
            }
            currentNode.alterRight(insertableNode);
            return;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new InOrderIterator<>(root);
    }
}
