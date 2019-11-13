package com.example.kotlininaction.chapter_04_objects_and_interfaces

object FilterAndMap {

    fun filter() {
        val list = arrayListOf(
            Person(name = "A"),
            Person(name = "B")
        )
        val filteredList = list.filter { it.name == "A" }
        Log("filter | ${list.hashCode()} | ${filteredList.hashCode()} : $filteredList")
    }

    fun map() {
        val list = arrayListOf(
            Person(name = "A"),
            Person(name = "B")
        )
        val filteredList = list.map { it.name }
        Log("map | : $filteredList")
    }

    fun mapItem() {
        val list = arrayListOf(
            Person(name = "A"),
            Person(name = "B")
        )
        val filteredList = list.map { it.name == "A" }
        Log("mapItem | $filteredList")
    }

    fun filterMaxItem() {
        val list = arrayListOf(
            Person(
                name = "A",
                age = 20
            ), Person(name = "B", age = 18)
        )
        val filteredList = list.filter { it.age == list.maxBy(Person::age)!!.age }
        Log("filterMaxItem | $filteredList")
    }

}