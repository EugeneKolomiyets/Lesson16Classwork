package com.alevel;

import java.util.LinkedList;
import java.util.Queue;

/*public class TreeIterator {
    public void walkInWidth(MyTree tree){
        Queue<MyTree> queue = new LinkedList<>();
        queue.offer(tree);
        while (!queue.isEmpty()){
            MyTree element = queue.poll();

            System.out.print(element.getValue());

            if (element.getLeft()!=null){
                queue.offer(element.getLeft());
            }
            if (element.getRight()!=null){
                queue.offer(element.getRight());
            }
        }
    }

    public void walkInDeepth(MyTree tree) {

        System.out.print(tree.getValue());

        if (tree.getLeft() != null) {
            walkInDeepth(tree.getLeft());
        }
        if (tree.getRight() != null) {
            walkInDeepth(tree.getRight());
        }
    }*/
public class TreeIterator {
    public <K extends Number,V> V searchInWidth(MyTree<K,V> tree,K key){
        Queue<MyTree<K,V>> queue = new LinkedList<>();
        queue.offer(tree);
        while (!queue.isEmpty()){
            MyTree<K,V> element = queue.poll();

            if (element.getKey().equals(key)){
                return element.getValue();
                //System.out.print(element.getValue());
            }


            if (element.getLeft()!=null){
                queue.offer(element.getLeft());
            }
            if (element.getRight()!=null){
                queue.offer(element.getRight());
            }
        }
        return null;
    }

    public <K extends Number,V> V walkInDeepth(MyTree<K,V> tree,K key) {

        if (tree.getKey().equals(key)){
            return tree.getValue();
            //System.out.print(tree.getValue());
        }
        V value=null;
        if (tree.getLeft() != null) {
            value = walkInDeepth(tree.getLeft(),key);
        }
        if ((tree.getRight() != null)&&(value==null)) {
            value = walkInDeepth(tree.getRight(),key);
        }
        return value;
    }


}

