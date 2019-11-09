package com.example.kotlininaction

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlininaction.chapter_4_objects_and_interfaces.*
import java.io.BufferedReader

class MainActivity : AppCompatActivity(), KotlinView.OnClickListener {

    override fun onKotlinViewClicked(kotlinView: KotlinView) {
        Log("onKotlinViewClicked")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val persons = listOf(Person("Alice"), Person("Robe", 29))
//        val oldest = persons.maxBy { it.age ?: 0 } // ?: Elvis operator
//
//        val list = listOf("A", "B", "C")
//        val resultString = list.joinToString(postfix = "]", prefix = "[")
//        Log.e(LOG_TAG, "resultString: $resultString")

//        val view: View = View(this)
//        val button: View = Button(this)
//
//        view.showOff()
//        button.showOff()
//
//        var kotlinView = KotlinView(this)
//        kotlinView.setOnKotlinClickListener(this)
//        kotlinView.onClick()
//        kotlinView.extensionFunction()


////        val lists = arrayOf("A", "B", "C")
//        val lists = listOf("A", "B", "C")
//        val maxValue = findMax(*lists.toTypedArray())
//        Log("$maxValue")

//        parseRegexp()


//        val sargis = User(1, "Sargis", "")
//        val srbuhi = User(2, "Srbuhi", "")

//        val kotlinClass = KotlinClass("S", 30)
//        kotlinClass.age = 10

//        val privateClass = PrivateClass()

        FilterAndMap.filter()
        FilterAndMap.map()
        FilterAndMap.mapItem()
        FilterAndMap.filterMaxItem()


        val view = View(this)

        view.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
            }
        })

        view.setOnClickListener {
            //            it.id
        }

        view.setOnClickListener {
            MainActivity::listenr
        }

        val listener = object : View.OnClickListener, View.OnLongClickListener {

            override fun onLongClick(v: View?): Boolean {
                return true
            }

            override fun onClick(v: View?) {
            }
        }

        listener.onClick(view)
    }

    val listenr = object : View.OnClickListener {
        override fun onClick(v: View?) {
        }
    }

    fun KotlinView.extensionFunction() {
        Log("MainActivity => extensionFunction")
    }

    private fun returnResult(): Int {
        val x: Int? = null
        try {
            Log.e("LOG_TAG", "TRY")
            return x!! / 12
        } catch (e: Exception) {
            Log.e("LOG_TAG", "CATCH")
            return 2
        } finally {
            //TODO finally will be returned
            Log.e("LOG_TAG", "FINALLY")
            return 3
        }
    }

    private fun readNumber(reader: BufferedReader): Int? {
        return try {
            val line = reader.readLine()
            Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            null
        } finally {
            reader.close()
        }
    }

    fun String.lastChar(): Char {
        return this.get(length - 1)
    }

    fun View.showOff() {
        Log("View: showOff")
    }

    fun Button.showOff() {
        Log("Button: showOff")
    }

    private fun findMax(vararg values: String): String {
        return values.max()!!
    }

    private fun infixKt() {
        var pair = 12.toKt("12")
        var pair2 = 12 toKt ("12") // TODO to use " " the toKt function must be marked as infix
        //TODO This method is called destructive declaration
        val (target, other) = 12 toKt ("12")

        pair.first
        pair.second
    }

    private fun parseRegexp() {
        val path = "/UsersYole/Kotlin-book/Chapter.adoc.xxxxxx"
        val regex = """(.+)/(.+)/(.+)\.(.+)""".toRegex()
        val matchResult = regex.matchEntire(path)
        if (matchResult != null) {
            val (x, directory, fileName, extension) = matchResult.destructured
            Log("x: $x, directory: $directory, fileName: $fileName, extension: $extension")
//            x: /UsersYole, directory: Kotlin-book, fileName: Chapter.adoc, extension: xxxxxx
        }
    }

    private fun saveUser(user: User) {
        user.validateBeforeSave()
        //save
    }
}