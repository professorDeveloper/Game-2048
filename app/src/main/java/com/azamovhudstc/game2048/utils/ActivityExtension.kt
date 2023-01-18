package com.azamovhudstc.game2048.utils

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.showMessage(message: String){
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}