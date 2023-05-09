package com.example.biggestnumber

import android.graphics.Color
import android.graphics.Color.GREEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*;


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftBtn.setOnClickListener {
            val leftnum = leftBtn.text.toString().toInt()
            val rightnum = rightBtn.text.toString().toInt()

            if (leftnum > rightnum) {
                bgView.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show()
                numberassigner()
            } else {
                bgView.setBackgroundColor(Color.RED)
                Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show()
                numberassigner()
            }
        }

        rightBtn.setOnClickListener {
            val leftnum = leftBtn.text.toString().toInt()
            val rightnum = rightBtn.text.toString().toInt()

            if (leftnum < rightnum) {
                bgView.setBackgroundColor(Color.GREEN)
                Toast.makeText(this, "Right answer", Toast.LENGTH_SHORT).show()
                numberassigner()
            } else {
                bgView.setBackgroundColor(Color.RED)
                Toast.makeText(this, "Wrong answer", Toast.LENGTH_SHORT).show()
                numberassigner()
            }
        }


    }

    private fun numberassigner() {
        val r = Random()
        val leftnum = r.nextInt(50)
        val rightnum = r.nextInt(50)

        while (leftnum == rightnum) {
            val rightnum = r.nextInt(50)
        }

        leftBtn.text = leftnum.toString()
        rightBtn.text = rightnum.toString()

    }
}


