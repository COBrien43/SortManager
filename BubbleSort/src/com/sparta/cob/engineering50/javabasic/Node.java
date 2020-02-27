package com.sparta.cob.engineering50.javabasic;

public class Node {
    private Node leftChild;
    private Node rightChild;
    private Node parent;
    private int value;
    private static int nodeCounter;

    public static int getNodeCounter() {
        return nodeCounter;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getValue() {
        return value;
    }

    public Node( Node parent, int value ){
        this.parent = parent;
        this.value = value;
    }


}
