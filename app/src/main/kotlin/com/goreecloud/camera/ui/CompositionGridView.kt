package com.goreecloud.camera.ui

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import com.goreecloud.camera.R

class CompositionGridView(context: Context) : View(context) {
    private val linePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = Color.argb(190, 255, 255, 255)
        strokeWidth = resources.displayMetrics.density
    }

    init {
        contentDescription = context.getString(R.string.composition_grid_content_description)
        importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_YES
        isClickable = false
        isFocusable = false
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (width <= 0 || height <= 0) return

        val thirdWidth = width / 3f
        val thirdHeight = height / 3f
        canvas.drawLine(thirdWidth, 0f, thirdWidth, height.toFloat(), linePaint)
        canvas.drawLine(thirdWidth * 2f, 0f, thirdWidth * 2f, height.toFloat(), linePaint)
        canvas.drawLine(0f, thirdHeight, width.toFloat(), thirdHeight, linePaint)
        canvas.drawLine(0f, thirdHeight * 2f, width.toFloat(), thirdHeight * 2f, linePaint)
    }
}
