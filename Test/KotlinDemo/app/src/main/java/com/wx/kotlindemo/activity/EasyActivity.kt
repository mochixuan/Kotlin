package com.wx.kotlindemo.activity

import android.view.View
import android.widget.Button
import com.wx.kotlindemo.R
import com.wx.kotlindemo.base.BaseActivity
import com.wx.kotlindemo.constant.DataConstant
import com.wx.kotlindemo.constant.NAME

class EasyActivity : BaseActivity() {

    override fun getLayouId(): Int {
        return R.layout.activity_easy
    }

    override fun initView() {

        (findViewById(R.id.btn_1) as Button).text = "常量"
        (findViewById(R.id.btn_1) as Button).setOnClickListener(View.OnClickListener {
            //-----引用常量-----
            System.out.println("=====================================>>"+ NAME) //不是对象的值
            System.out.println("=====================================>>"+ DataConstant.AGE)
            System.out.println("=====================================>>"+ DataConstant.SEX)
        })

    }

    override fun initData() {

    }

}
