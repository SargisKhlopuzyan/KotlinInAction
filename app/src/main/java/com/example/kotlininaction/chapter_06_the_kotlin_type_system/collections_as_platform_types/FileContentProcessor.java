package com.example.kotlininaction.chapter_06_the_kotlin_type_system.collections_as_platform_types;

import java.io.File;
import java.util.List;

public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContent, List<String> textContents);
}
