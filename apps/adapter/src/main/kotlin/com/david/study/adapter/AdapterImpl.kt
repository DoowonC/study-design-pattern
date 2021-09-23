package com.david.study.adapter

class AdapterImpl: Adapter {
    override fun twiceOf(f: Float): Float {
        return Math.doubled(f.toDouble()).toFloat()
    }

    override fun halfOf(f: Float): Float {
        return Math.half(f.toDouble()).toFloat()
    }
}