package com.kotlin.ktobserve

class ObserveManager private constructor() {
    private var list = mutableListOf<ObserverListener>()

    companion object {
        val instance: ObserveManager by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { ObserveManager() }
    }

    fun add(observerListener: ObserverListener) {
        list.add(observerListener)
    }

    fun update(string: String) {
        list.forEach {
            it.update(string)
        }
    }
}