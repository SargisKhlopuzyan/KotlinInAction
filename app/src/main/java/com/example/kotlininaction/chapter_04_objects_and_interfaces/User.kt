package com.example.kotlininaction.chapter_04_objects_and_interfaces

data class User(val id: Int, val name: String, var address: String)

fun User.validateBeforeSave() {

    fun validate(value: String, fieldName: String) {
        if (value == null) {
            throw IllegalArgumentException("Can't save user $id empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "Address")

}