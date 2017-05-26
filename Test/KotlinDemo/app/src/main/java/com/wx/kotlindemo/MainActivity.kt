package com.wx.kotlindemo

import android.view.View
import android.widget.Button
import com.wx.kotlindemo.activity.GrammarActivity
import com.wx.kotlindemo.base.BaseActivity

/**
 * 一切从简，用最初的方式熟悉每一个方法
 *                                   ~ mochixuan
 * */

class MainActivity : BaseActivity() , View.OnClickListener{

    override fun getLayouId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        findViewById(R.id.btn_1).setOnClickListener(this)
    }

    override fun initData() {
        (findViewById(R.id.btn_1) as Button).text = "语法"
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.btn_1 -> openActivity(GrammarActivity::class.java)
            else -> showToast("UnKnown") //相当于switch default
        }
    }

}
