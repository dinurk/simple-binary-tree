package BinaryTree.Iterator;

import BinaryTree.Abstract.BinaryTreeNode;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class InOrderIterator<T> implements Iterator<T> {

    private Stack<BinaryTreeNode<T>> traversalStack;

    public InOrderIterator(BinaryTreeNode<T> root) {
        traversalStack = new Stack<>();
        if(root != null){
            traversalStack.push(root);

            BinaryTreeNode<T> current = root;
            while(current.hasLeft()) {
                traversalStack.push(current.left());
                current = current.left();
            }
        }
    }

    @Override
    public boolean hasNext() {
        return !traversalStack.empty();
    }

    @Override
    public T next() {

        if(traversalStack.empty()) {
            throw new NoSuchElementException("requested element does not exist");
        }

        BinaryTreeNode<T> resultNode = traversalStack.pop();
        if(resultNode.hasRight()) {
            traversalStack.push(resultNode.right());

            BinaryTreeNode<T> current = resultNode.right();
            while(current.hasLeft()) {
                traversalStack.push(current.left());
                current = current.left();
            }
        }

        return resultNode.value();
    }
}
