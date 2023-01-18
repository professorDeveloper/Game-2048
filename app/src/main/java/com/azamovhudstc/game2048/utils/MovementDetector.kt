package com.azamovhudstc.game2048.utils

import android.content.Context
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View
import com.azamovhudstc.game2048.data.Movement
import kotlin.math.abs

class MovementDetector(contex: Context) : View.OnTouchListener {
    private var listener: ((Movement) -> Unit)? = null
    private val MOVE_REQUIREMENT = 150
    private val gesture =
        GestureDetector(contex, object : GestureDetector.SimpleOnGestureListener() {
            override fun onFling(
                e1: MotionEvent,
                e2: MotionEvent,
                velocityX: Float,
                velocityY: Float
            ): Boolean {
                if (abs(e1.x - e2.x) > abs(e1.y - e2.y)) {
                    if (abs(e1.x - e2.x) < MOVE_REQUIREMENT) return false
                    listener?.invoke(if (e2.x > e1.x) Movement.RIGHT else Movement.LEFT)
                } else if (abs(e1.x - e2.x) < abs(e1.y - e2.y)) {
                    if (abs(e1.y - e2.y) < MOVE_REQUIREMENT) return false
                    listener?.invoke(if (e2.y > e1.y) Movement.DOWN else Movement.UP)
                }
                return true
            }
        })

    override fun onTouch(v: View?, v2: MotionEvent?): Boolean {
        gesture.onTouchEvent(v2)
        return true
    }

    fun setOnMovementListener(block: (Movement) -> Unit){
        listener = block
    }
}