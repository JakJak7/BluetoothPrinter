package me.jakjak.bluetoothprinter.ui

import android.arch.lifecycle.ViewModel
import me.jakjak.bluetoothprinter.model.ThingModel
import java.util.*

class SomeViewModel(private val thing : ThingModel) : Observer, ViewModel() {
    override fun update(p0: Observable?, p1: Any?) {
        if (p1 is String) {

        }
    }

    init {
        thing.addObserver(this)
    }

    fun doThing() {

    }
}