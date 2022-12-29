package BinaryTree.BinaryTreeNode;

public interface BinaryTreeNode<T> extends BinaryTreeNodePrototype<T> {
    BinaryTreeNode<T> right();
    BinaryTreeNode<T> left();
    void alterLeft(BinaryTreeNode<T> node);
    void alterRight(BinaryTreeNode<T> node);
    boolean hasLeft();
    boolean hasRight();
    T value();
}
