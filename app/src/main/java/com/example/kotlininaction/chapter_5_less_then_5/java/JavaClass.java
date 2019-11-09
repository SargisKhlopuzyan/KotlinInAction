package com.example.kotlininaction.chapter_5_less_then_5.java;

import com.example.kotlininaction.chapter_5_less_then_5.CaseInsensitiveFileComparator;

import java.io.File;

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
public class JavaClass {

    public JavaClass(CaseInsensitiveFileComparator caseInsensitiveFileComperator) {
        this.caseInsensitiveFileComperator = caseInsensitiveFileComperator;
    }

    CaseInsensitiveFileComparator caseInsensitiveFileComperator = CaseInsensitiveFileComparator.INSTANCE;

    void javaFunction() {
        caseInsensitiveFileComperator.compare(new File("/User"), new File("/user"));

//        HashMap<String, String> hashMap = new HashMap();
//        hashMap.put()
    }
}
