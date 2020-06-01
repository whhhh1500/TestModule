package com.cc1500.system.map;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;

public class Maptest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>(100);
        System.out.println(tableSizeFor(100));
        for (int i = 0; i <= 20; i++) {
            map.put(i, i + 1);
        }
        AVLTree avlTree = new AVLTree<>("101");
       avlTree.insert("100");
        System.out.println(avlTree.toString());

    }



    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : n + 1;
    }
}
