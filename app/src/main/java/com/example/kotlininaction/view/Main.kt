package com.example.kotlininaction.view


fun main() {

    val myView = MyView()
    myView.setOnClickListener(object : MyView.MyClickListener {
        override fun myOnClicked(view: MyView) {

        }

    })

//    myView.setOnClickListener( (view) -> {})

}