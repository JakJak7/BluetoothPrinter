package me.jakjak.bluetoothprinter.mvvm.model

import java.util.*

class ThingModel : Observable() {

    var property1: String = ""
    set(value) {
        field = value
        setChangedAndNotify("property1")
    }

    private fun setChangedAndNotify(field: Any)
    {
        setChanged()
        notifyObservers(field)
    }
}