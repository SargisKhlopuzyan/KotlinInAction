package com.example.kotlininaction.view

class MyView {

    interface MyClickListener {
        fun myOnClicked(view: MyView)
    }

    lateinit var myClickListener: MyClickListener

    fun setOnClickListener(myClickListener: MyClickListener) {
        this.myClickListener = myClickListener
    }

}