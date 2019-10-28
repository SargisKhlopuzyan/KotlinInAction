package com.example.kotlininaction.chapter_less_then_5

import java.io.File

/**
 * Created by Joomag, Inc., on 10/22/2019.
 *
 * @author Sargis Khlopuzyan (s.khlopuzyan@joomag.com)
 */
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        return o1.path.compareTo(o2.path, ignoreCase = true)
    }
}