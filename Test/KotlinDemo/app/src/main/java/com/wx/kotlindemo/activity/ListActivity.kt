package com.wx.kotlindemo.activity

import android.os.Environment
import android.view.View
import android.widget.Button
import com.wx.kotlindemo.R
import com.wx.kotlindemo.base.BaseActivity
import com.wx.kotlindemo.bean.Student
import java.io.File

class ListActivity : BaseActivity() {

    override fun getLayouId(): Int {
        return R.layout.activity_list
    }

    override fun initView() {

        (findViewById(R.id.btn_1) as Button).text = "闭包"
        (findViewById(R.id.btn_1) as Button).setOnClickListener(View.OnClickListener {
            closure
        })

        (findViewById(R.id.btn_2) as Button).text = "只读集合"
        (findViewById(R.id.btn_2) as Button).setOnClickListener(View.OnClickListener {
            onlyRead()
        })

        (findViewById(R.id.btn_3) as Button).text = "测试非空"
        (findViewById(R.id.btn_3) as Button).setOnClickListener(View.OnClickListener {
            testnotNullAndElse()
        })

        (findViewById(R.id.btn_4) as Button).text = "标签"
        (findViewById(R.id.btn_4) as Button).setOnClickListener(View.OnClickListener {
            testLabel()
        })

        (findViewById(R.id.btn_5) as Button).text = "测试?优点"
        (findViewById(R.id.btn_5) as Button).setOnClickListener(View.OnClickListener {
            testWen()
        })

    }

    override fun initData() {
    }

    //-----1.闭包模式-----
    val closure = if (5>3) {
        println("=================>>yes")
    } else{
        println("=================>>no")
    }

    //-----2.自读集合-----
    fun onlyRead() {
        val list = listOf("wang",1,"xuan",2)
        val map = mapOf<Int,String>(1 to "wang",2 to "xuan",4 to "chi")
        System.out.println("=====================1>>"+list[1]+"   "+list[2])
        System.out.println("=====================2>>"+map[4]+"   "+map[2])
    }

    //-----3.测试非空 有用开发时------
    fun testnotNullAndElse() {
        val files = File(Environment.getExternalStorageDirectory().absolutePath).listFiles()
        val files1 = File("test").listFiles()
        println("=============================1>>"+files?.size)
        println("=============================2>>"+files?.size?:"wang")

        println("=============================3>>"+files1?.size)
        println("=============================4>>"+files1?.size?:"wang")
    }

    //-----4.标签-----
    fun testLabel() {
        loop@ for (i in 1..11) {
            for (j in 1..4) {
                if (i %2 == 0) {
                    System.out.println("===========a>>"+i)
                    break@loop
                } else{
                    System.out.println("===========b>>"+i)
                }
            }
        }
    }

    //-----测试?有点-----
    fun testWen() {
        var student: Student = Student("wang xuan",22)

        System.out.println("==========================1>>"+student?.age)

        System.out.println("==========================3>>"+student?.person?.getString())

        if (student?.person?.getString() is String) {
            System.out.println("=============4>>")
        }else{
            System.out.println("=============5>>")
        }

    }

}
