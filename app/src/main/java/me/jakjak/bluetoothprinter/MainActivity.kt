package me.jakjak.bluetoothprinter

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btManager : BluetoothManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Started!", Toast.LENGTH_SHORT).show()
    }
}
