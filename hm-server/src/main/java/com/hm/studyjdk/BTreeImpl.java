package com.hm.studyjdk;

import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * 焦志军 : 实现一个b-tree
 */

public class BTreeImpl implements BTree {
    @Test
    public void test() {
        BTree bTree = new BTreeImpl();
        int[] ints = new int[]{1, 5, 7, 8, 4, 3, 30, 56, 7, 4};

        IntStream.range(0,100).mapToObj(i->i+100000).forEach(o-> System.out.println(o));

        IntStream.range(0, 100).filter(i -> i > 88).forEach(i -> {
            System.out.println(i);
            int ddd = new Random().nextInt(100000);
            bTree.add(ddd);
            System.out.print(ddd + " ");
        });

        System.out.println("\n" + bTree.search(70546));
    }

    //根节点
    BinaryNode root;
    //临时节点
    BinaryNode temp = root;

    @Override
    public Boolean add(int i) {
        if (root == null) {
            root = new BinaryNode(i);
            temp = root;
            return true;
        } else {
            //无线循环，判断节点位置
            while (true) {
                if ((temp.element > i)) {
                    if (temp.left == null) {
                        temp.left = new BinaryNode(i);
                        return true;
                    } else {
                        temp = temp.left;
                    }

                } else {
                    if (temp.right == null) {
                        temp.right = new BinaryNode(i);
                        return true;
                    } else {
                        temp = temp.right;
                    }
                }
            }


        }


    }

class mapTestDto{
        String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
    @Override
    public Boolean remove(int i) {
        return null;
    }

    @Override
    public Boolean search(int i) {
        temp = root;
        while (true) {
            if (temp.element == i) {
                return true;

            } else {
                if (temp.element > i) {
                    temp = temp.left;
                    if (temp == null) return false;
                } else {
                    temp = temp.right;
                    if (temp == null) return false;
                }
            }
        }
    }


}

/**
 * 节点
 */
class BinaryNode {
    BinaryNode(int i) {
        element = i;
    }

    int element;
    BinaryNode left;
    BinaryNode right;
}

interface BTree {
    Boolean add(int i);

    Boolean remove(int i);

    Boolean search(int i);

}