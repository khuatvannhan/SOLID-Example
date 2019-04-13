package com.nhankv.solidexample.dip.before

import android.util.Log

class Logger  {
    private val TAG = javaClass.name

    fun logInfo(message: String) {
        // do something
        Log.d(TAG, message)
    }
}
