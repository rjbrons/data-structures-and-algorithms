package code.challenges.TreeIntersection;

import code.challenges.tree.BinarySearchTree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TreeIntersection {

    public static ArrayList<Integer>  findIntersections(BinarySearchTree<Integer> tree1, BinarySearchTree<Integer> tree2){
//        HashMap<Integer, Integer> values = new HashMap<>();
//        while (tree1.getRoot().getLeft() != null && tree1.getRoot().getRight() != null){
//            Integer key = (Integer)tree1.getRoot().getValue();
//            if (values.containsKey(key)){
//                values.put(key, values.get(key) + 1);
//            } else {
//                values.put(key, 1);
//            }
//
//        }
        ArrayList<Integer> tempT1 = tree1.preOrder(tree1.getRoot());
        ArrayList<Integer> tempT2 = tree2.preOrder(tree2.getRoot());
        ArrayList<Integer> intersections = new ArrayList<>();
        for ( Integer num : tempT1){
            if (tempT2.contains(num)){
                intersections.add(num);
            }
        }
        return intersections;

    }
}
