package com.example.kotlininaction.chapter_4_objects_and_interfaces;

import android.util.Log;

import java.util.ArrayList;

import static com.example.kotlininaction.chapter_4_objects_and_interfaces.CountKt.LOG_TAG;

public class JavaClass {

    private void javaFunction() {

        int x;
        if ((x = 10) == 20) {
        }

        boolean condition = true;
        final int yyyy;

        if (condition) {
            yyyy = 10;
        } else {
            yyyy = 130;
        }

//        JoinKt.joinToString();
        StringFunctions.joinToString(new ArrayList<String>(), "-", "[", "]");

        CountKt.performOperation();
        CountKt.performOperation();
        CountKt.reportOperationCount();
        Log.e(LOG_TAG, "CountKt.getOpCount(): " + CountKt.getOpCount());
    }
}
