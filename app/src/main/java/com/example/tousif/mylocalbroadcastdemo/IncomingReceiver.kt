package com.example.tousif.mylocalbroadcastdemo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager
import android.widget.Toast

class IncomingReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
        if(state == TelephonyManager.EXTRA_STATE_RINGING){
            Toast.makeText(context,"Phone ringing",Toast.LENGTH_SHORT).show()
        }

        if (state == TelephonyManager.EXTRA_STATE_OFFHOOK){
            Toast.makeText(context,"Phone Received",Toast.LENGTH_SHORT).show()
        }

        if(state == TelephonyManager.EXTRA_STATE_IDLE){
            Toast.makeText(context,"Phone Disconnected",Toast.LENGTH_SHORT).show()
        }
    }
}
