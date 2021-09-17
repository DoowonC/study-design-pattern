package com.david.study.sample

class AObj {

    private val aInterface: AInterface = AInterfaceImpl()

    fun funcAA() {
        aInterface.funcA()
        aInterface.funcA()
    }

}