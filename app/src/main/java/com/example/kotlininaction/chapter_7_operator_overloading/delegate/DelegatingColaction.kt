package com.example.kotlininaction.chapter_7_operator_overloading.delegate

class DelegatingColaction<T> : Collection<T> {

    var innerList = arrayListOf<T>()

    override val size: Int
        get() = innerList.size

    override fun contains(element: T): Boolean {
        return innerList.contains(element)
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        return innerList.containsAll(elements)
    }

    override fun isEmpty(): Boolean {
        return innerList.isEmpty()
    }

    override fun iterator(): Iterator<T> {
        return innerList.iterator()
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder("[")
        for ((index, element) in innerList.withIndex()) {
            if (index > 0)
                stringBuilder.append(", ")
            stringBuilder.append(element.toString())
        }
        stringBuilder.append("]")
        return stringBuilder.toString()
    }

}