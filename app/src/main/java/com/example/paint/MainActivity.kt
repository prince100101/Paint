package com.example.paint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.paint.PaintView.Companion.colorList
import com.example.paint.PaintView.Companion.currentBrush
import com.example.paint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {
    companion object {
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tealButton: ImageButton= findViewById(R.id.iBtealButton)
        val blackButton: ImageButton= findViewById(R.id.iBblackButton)
        val blueButton: ImageButton= findViewById(R.id.iBblueButton)
        val eraser: ImageButton= findViewById(R.id.iBeraser)

        tealButton.setOnClickListener{
            paintBrush.color = Color.parseColor("#FF018786")
            currentColor(paintBrush.color)
        }

        blackButton.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        blueButton.setOnClickListener{
            paintBrush.color= Color.parseColor("#FF3700B3")
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}