import BinaryTree.Abstract.BinaryTree;
import BinaryTree.BinarySearchTree.BinarySearchTree;
import BinaryTree.Comparator.IntegerComparator;
import BinaryTree.SimpleBinaryTree.SimpleBinaryTree;

public class Main {
    public static void main(String ...args) {

        /* структура данных - простое двоичное дерево
         * заполняется по уровням
         * обход дерева выполняется по уровням (через итератор)
         * */
        BinaryTree<Integer> tree1 = new SimpleBinaryTree<>();
        tree1.insert(1);
        tree1.insert(22);
        tree1.insert(3);
        tree1.insert(-3);
        tree1.insert(5);

        System.out.println("1) Simple Binary Tree:");
        for (Integer value : tree1) { // выведет:  1 22  3 -3  5
            System.out.print(String.format("%2s", value) + " ");
        }
        System.out.println("\n");

        /* структура данных - двоичное дерево поиска
         * обход дерева симметричный (через итератор)
         * */
        BinaryTree<Integer> tree2 = new BinarySearchTree<>(new IntegerComparator());
        tree2.insert(5);
        tree2.insert(-2);
        tree2.insert(7);
        tree2.insert(44);
        tree2.insert(9);
        tree2.insert(-3);

        System.out.println("2) Binary Search Tree:");
        for (Integer value : tree2) { //выведет: -3 -2  5  7  9 44
            System.out.print(String.format("%2s", value) + " ");
        }
        System.out.println();
    }
}