package com.azamovhudstc.game2048.app

import android.app.Application
import com.azamovhudstc.game2048.shared.LocalData

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        LocalData.getInstance(this)
    }
}