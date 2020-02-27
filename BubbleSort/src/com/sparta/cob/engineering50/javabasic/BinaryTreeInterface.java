package com.sparta.cob.engineering50.javabasic;


public interface BinaryTreeInterface {
    int getRootNode();
    int getNumberOfNodes();
    void addNode(Node node);
    void addNodes(Node[] nodes);
    boolean findNode(int value);
    int getLeftChild(Node node);
    int getRightChild(Node node);
    int[] getSortedTreeAsc();
    int[] getSortedTreeDesc();
}