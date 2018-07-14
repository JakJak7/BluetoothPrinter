package me.jakjak.bluetoothprinter

import android.app.Service
import android.content.Intent
import android.os.Handler
import android.os.IBinder

class UpdateListenerService : Service() {

    private final var INTERVAL = 30 * 1000
    private lateinit var handler : Handler

    override fun onBind(p0: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}