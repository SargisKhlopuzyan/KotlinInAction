package com.example.kotlininaction.chapter_05_less_then_5.java;

import android.util.Log;

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
public class JavaAnonymousClasses {

    // 1 : Anonymous Inner class that extends a class
    JavaSupperClass anonymousInnerClass1 = new JavaSupperClass() {
        @Override
        void printLog() {
            Log.e("LOG_TAG", "ANONYMOUS JAVA CLASS");
        }
    };

    // 2 : Anonymous Inner class that implements a interface
    JavaInterface anonymousInnerClass2 = new JavaInterface() {
        @Override
        public void printLogInterface() {
            Log.e("LOG_TAG", "ANONYMOUS JAVA CLASS");
        }
    };

    // 3 : Anonymous Inner class that defines inside method/constructor argument
    JavaClassWithAnonymousClassAsArgument anonymousClassAsArgument = new JavaClassWithAnonymousClassAsArgument(new JavaClassWithAnonymousClassAsArgument.JavaClassWithAnonymousClassAsArgumentInterface() {
        @Override
        public void printLog() {

        }
    });

}
