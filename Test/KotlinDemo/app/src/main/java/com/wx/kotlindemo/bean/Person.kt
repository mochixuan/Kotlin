package com.wx.kotlindemo.bean

class Person(private var name : String) {

    private var age : Int = 0

    init {          //可以在这里初始化
        name = "wang xuan"
    }

    constructor(name: String,age : Int) : this(name) {
        this.age = age
    }

    internal fun getString() :String{
        return name+"  "+age
    }

}
