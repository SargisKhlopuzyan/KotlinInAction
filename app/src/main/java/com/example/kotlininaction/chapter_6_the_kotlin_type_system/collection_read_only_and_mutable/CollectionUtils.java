package com.example.kotlininaction.chapter_6_the_kotlin_type_system.collection_read_only_and_mutable;

import java.util.Collection;
import java.util.List;

/* Java */
public class CollectionUtils {

    public static Collection<String> uppercaseAll(List<String> items) {
        for (int i = 0; i < items.size(); i++) {
            items.set(i, items.get(i).toUpperCase());
        }
        /** Throws exception only at Runtime
         * */
//        items.add("D");
        return items;
    }
}
