package BinaryTree.Abstract;

public interface BinaryTreeNode<T> {
    BinaryTreeNode<T> right();
    BinaryTreeNode<T> left();
    void alterLeft(BinaryTreeNode<T> node);
    void alterRight(BinaryTreeNode<T> node);
    boolean hasLeft();
    boolean hasRight();
    T value();
}
