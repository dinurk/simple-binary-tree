package BinaryTree.BinaryTreeNode;

import BinaryTree.Abstract.BinaryTreeNode;

public class SimpleBinaryTreeNode<T> implements BinaryTreeNode<T> {

    private final T value;
    private BinaryTreeNode<T> left, right;

    public SimpleBinaryTreeNode(T value){
        this.value = value;
    }

    @Override
    public BinaryTreeNode<T> right() {
        return right;
    }

    @Override
    public BinaryTreeNode<T> left() {
        return left;
    }

    @Override
    public void alterLeft(BinaryTreeNode<T> node) {
        left = node;
    }

    @Override
    public void alterRight(BinaryTreeNode<T> node) {
        right = node;
    }

    @Override
    public boolean hasLeft() {
        return left != null;
    }

    @Override
    public boolean hasRight() {
        return right != null;
    }

    @Override
    public T value() {
        return value;
    }
}
