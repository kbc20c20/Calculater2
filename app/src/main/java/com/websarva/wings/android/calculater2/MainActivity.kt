package com.websarva.wings.android.calculater2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btClick = findViewById<Button>(R.id.EqualsButton)
        val listener = CalculateListener()
        btClick.setOnClickListener(listener)

    }

    private inner class CalculateListener : View.OnClickListener{
        override fun onClick(v: View?) {
            val Receiver = findViewById<EditText>(R.id.ReceiverView)
            val Operater = findViewById<EditText>(R.id.OperaterView)
            val Symbols = findViewById<Spinner>(R.id.MathSymbols)
            val Text = findViewById<TextView>(R.id.AnswerView)
            val rec = Integer.parseInt(Receiver.toString())
            val ope = Integer.parseInt(Operater.toString())
            val sym = Symbols.toString()
            var result = 0

            when(sym){
                "+" -> {
                    result=rec + ope
                }
                "-" -> {
                    result = rec - ope
                }
                "x" -> {
                    result=rec * ope
                }
                "÷" -> {
                    result = rec / ope
                }
            }

            Text.text=result.toString()
        }

    }
}