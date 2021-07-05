package com.kharismarizqii.diplayground

import android.content.Context

class Engine(val context: Context, val owner: String) {
    fun startEngine(){
        println("${context.getString(R.string.engine_started)} by $owner")
    }
}