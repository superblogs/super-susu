package com.hm.studyjdk;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huwenjian
 */
public class BinTree {
    /**
     *左孩子
     */
    private BinTree lChild;
    /**
     *右孩子
     */
    private BinTree rChild;
    /**
     *根节点
     */
    private BinTree root;
    /**
     *数据域
     */

    private Object data;
    /**
     * 存储所有的节点
     */
    private List<BinTree> datas;
    public BinTree(BinTree lChild, BinTree rChild, Object data) {
        super();
        this.lChild = lChild;
        this.rChild = rChild;
        this.data = data;
    }
    public BinTree(Object data) {
        this(null, null, data);

    }
    public BinTree() {
        super();
    }

    public void createTree(Object[] objs){
        datas=new ArrayList<BinTree>();
        for (Object object : objs) {
            datas.add(new BinTree(object));
        }
        /**
         * 将第一个作为根节点
         */
        root=datas.get(0);
        for (int i = 0; i < objs.length/2; i++) {
            datas.get(i).lChild=datas.get(i*2+1);
            /**
             * 避免偶数的时候 下标越界
             */
            if(i*2+2<datas.size()){
                datas.get(i).rChild=datas.get(i*2+2);
            }
        }
    }

    /**
     * 先序遍历
     */
    public void preorder(BinTree root){
        if(root!=null){
            visit(root.getData());
            preorder(root.lChild);
            preorder(root.rChild);
        }

    }

    /**
     * //中序遍历
     */
    public void inorder(BinTree root){
        if(root!=null){
            inorder(root.lChild);
            visit(root.getData());
            inorder(root.rChild);
        }

    }

    /**
     * 后序遍历
     */
    public void afterorder(BinTree root){
        if(root!=null){
            afterorder(root.lChild);
            afterorder(root.rChild);
            visit(root.getData());
        }

    }
    private void visit(Object obj) {
        System.out.print(obj+" ");
    }
    public Object getData() {
        return data;
    }
    public BinTree getRoot() {
        return root;
    }
}
