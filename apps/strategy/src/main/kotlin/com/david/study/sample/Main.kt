package com.david.study.sample

class Main

fun main(args: Array<String>) {
    val aInterface: AInterface = AInterfaceImpl()

    // 기능을 사용할 통로
    aInterface.funcA()

    val aObj = AObj()
    aObj.funcAA()

}