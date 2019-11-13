package com.example.kotlininaction.chapter_04_objects_and_interfaces

import android.content.Context

class KotlinView(var context: Context) {

    interface OnClickListener {
        fun onKotlinViewClicked(kotlinView: KotlinView)
    }

    private lateinit var onClickListener: OnClickListener

    fun setOnKotlinClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    fun onClick() {
        if (onClickListener != null) {
            onClickListener.onKotlinViewClicked(this)
        }
    }

    fun extensionFunction() {
        Log("KotlinClass => extensionFunction")
    }
}