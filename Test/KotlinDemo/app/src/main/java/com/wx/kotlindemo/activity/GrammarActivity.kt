package com.wx.kotlindemo.activity

import android.view.View
import android.widget.Button
import com.wx.kotlindemo.R
import com.wx.kotlindemo.base.BaseActivity

class GrammarActivity : BaseActivity() {

    //-----局部变量不可变-----
    val wang1: Int = 1
    val wang2 = "wang2"     //自动识别

    override fun getLayouId(): Int {
        return R.layout.activity_grammar;
    }

    override fun initView() {
        (findViewById(R.id.btn_1) as Button).text = "简单函数"
        (findViewById(R.id.btn_1) as Button).setOnClickListener(View.OnClickListener {
            (findViewById(R.id.btn_1) as Button).text = "简单函数: " + sum2(1, 2)
        })

        (findViewById(R.id.btn_2) as Button).text = "简单输出"
        (findViewById(R.id.btn_2) as Button).setOnClickListener(View.OnClickListener {
            printSum(3,4)
        })

        (findViewById(R.id.btn_3) as Button).text = "类型检测"
        (findViewById(R.id.btn_3) as Button).setOnClickListener(View.OnClickListener {
            showToast(checkType(100))
            showToast(checkType("wang"))
        })

        (findViewById(R.id.btn_4) as Button).text = "for循环"
        (findViewById(R.id.btn_4) as Button).setOnClickListener(View.OnClickListener {
            testFor()
        })

        (findViewById(R.id.btn_5) as Button).text = "In 用法"
        (findViewById(R.id.btn_5) as Button).setOnClickListener(View.OnClickListener {
            testIn()
        })
        (findViewById(R.id.btn_6) as Button).text = "初识集合(链式)"
        (findViewById(R.id.btn_6) as Button).setOnClickListener(View.OnClickListener {
            testList()
        })
    }

    override fun initData() {

    }

    //-----1.简单函数-----
    fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int): Int = if (a > b) a-b else a+b

    //-----2.简单输出
    fun printSum(a: Int, b: Int) {
        println("wo shi sum $a + $b = ${a+b}")
        showToast("wo shi sum $a + $b = ${a+b}")
    }

    //-----3.类型检测-----
    fun checkType(data: Any): String? {
        if (data is String) return data.substring(0,data.length)
        return null
    }

    //-----4.for循环-----
    fun testFor() {
        val items = listOf("hai","mei","xue","jihe");
        for (item in items) {
            print(item+"    ");
        }
        println()
    }

    //-----5.in 运算符来检测某个数字是否在指定区间内-----
    fun testIn() {
        val x = 10;
        val y = 9;

        if (x in 1..y) {
            println("=========(x in 1..y)="+true)
        } else{
            println("=========(x in 1..y)="+false)
        }

        if (x in 1..y+1) {
            println("=========(x in 1..y+1)="+true)
        } else{
            println("=========(x in 1..y+1)="+false)
        }

        for (a in 1..10) {
            println("========(a in 1..10)="+a)
        }

        for (a in 1..10 step 2) {
            println("========(a in 1..10 step 2)="+a)
        }

        for (a in 10 downTo 3 ) {
            println("========(a in 10 downTo 3)="+a)
        }

    }

    //-----6.初识集合-----
    fun testList() {
        val data = listOf<String>("apple","banana","car","driver","average","advance")
        data.filter {
            it.startsWith("a")
        }.sortedBy {
            it
        }.map {
            it.toUpperCase()
        }.forEach {
            println("=========>>"+it)
        }
    }

}

