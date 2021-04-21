package com.alevel;

public class Main {
    public static void main(String[] args) {
        //MyTree tree = MyTree.bulder().value("A")
/*        MyTree tree = MyTree.builder("A")
                            .left(MyTree.builder("B")
                                    .left(MyTree.builder("C")
                                            .build())
                                    .right(MyTree.builder("D")
                                            .build())
                                    .build())
                            .right(MyTree.builder("E")
                                    .right(MyTree.builder("F")
                                            .build())
                                    .build())
                            .build();

        TreeIterator iterator = new TreeIterator();
        iterator.walkInWidth(tree);
        System.out.println();
        iterator.walkInDeepth(tree);
    */
        MyTree<Integer, String> tree = MyTree.builder(1, "A")
                .left(MyTree.builder(2, "B")
                        .left(MyTree.builder(3, "C")
                                .build())
                        .right(MyTree.builder(4, "D")
                                .build())
                        .build())
                .right(MyTree.builder(5, "E")
                        .right(MyTree.builder(6, "F")
                                .build())
                        .build())
                .build();

        TreeIterator iterator = new TreeIterator();
        System.out.println(iterator.searchInWidth(tree, 5));
        System.out.println();
        System.out.println(iterator.walkInDeepth(tree,6));
    }
}
