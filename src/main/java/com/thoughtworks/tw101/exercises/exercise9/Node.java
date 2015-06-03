package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;    // The data in the node
    private Node left;      // Left child
    private Node right;     // Right child

    public Node(String name) {
        this.name = name;
        left = null;
        right = null;
    }

    public void add(String nameOfNewNode) {
        int compareResult = nameOfNewNode.compareTo(name);

        if (compareResult <= 0) {
            this.left = add(nameOfNewNode, this.left);
        } else if (compareResult > 0) {
            this.right = add(nameOfNewNode, this.right);
        }
    }

    /**
     * Return a list of the tree nodes in sorted order
     *
     * @return list of sorted tree nodes
     */
    public List<String> names() {
        List<String> listOfNames = new ArrayList<String>();
        return names(this, listOfNames);
    }

    /**
     * Internal method to insert into a subtree.
     *
     * @param nameOfNewNode the item to insert.
     * @param node          the node that roots the subtree
     * @return the new root of the subtree
     */
    private Node add(String nameOfNewNode, Node node) {
        if (node == null) {
            return new Node(nameOfNewNode);
        }

        int compareResult = nameOfNewNode.compareTo(node.name);

        if (compareResult <= 0) {
            node.left = add(nameOfNewNode, node.left);
        } else if (compareResult > 0) {
            node.right = add(nameOfNewNode, node.right);
        }

        return node;
    }

    /**
     * Internal method to create a list of a subtree in sorted order.
     *
     * @param node the node that roots the subtree.
     * @return sorted list of Strings
     */
    private List<String> names(Node node, List<String> listOfNames) {
        if (node != null) {
            names(node.left, listOfNames);
            listOfNames.add(node.name);
            names(node.right, listOfNames);
        }
        return listOfNames;
    }
}
