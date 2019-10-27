package com.example.kotlininaction.chapter_6_the_kotlin_type_system.collections_as_platform_types

import java.io.File

class FileIndexer : FileContentProcessor {

    override fun processContents(path: File, binaryContent: ByteArray?, textContents: MutableList<String>?) {

    }
}