package com.hm.studyjdk;

import org.junit.Test;

public class BinTreeTest {
    @Test
    public void binTree() {
        BinTree binTree = new BinTree();
        Object[] obj = {0, 1, 2, 3, 4, 5, 6, 7};
        binTree.createTree(obj);
        // 先序遍历
        System.out.println("先序遍历");
        binTree.preorder(binTree.getRoot());
        //中序遍历
        binTree.inorder(binTree.getRoot());
        //后序遍历
        binTree.afterorder(binTree.getRoot());
    }
}
