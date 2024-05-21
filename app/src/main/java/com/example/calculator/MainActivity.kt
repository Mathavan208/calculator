package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var value1 = ""
    private var value2 = ""
    private var operator = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val textView: TextView = findViewById(R.id.textView1)
//
//        val numberButtons = listOf(
//            findViewById<Button>(R.id.btn1),
//            findViewById<Button>(R.id.btn2),
//            findViewById<Button>(R.id.btn3),
//            findViewById<Button>(R.id.btn4),
//            findViewById<Button>(R.id.btn5),
//            findViewById<Button>(R.id.btn6),
//            findViewById<Button>(R.id.btn7),
//            findViewById<Button>(R.id.btn8),
//            findViewById<Button>(R.id.btn9),
//        )
//
//        val operatorButtons = listOf(
//            findViewById<Button>(R.id.plus),
//            findViewById<Button>(R.id.minus),
//            findViewById<Button>(R.id.divison),
//            findViewById<Button>(R.id.multiply),
//        )
//
//        val equalsButton = findViewById<Button>(R.id.equals)
//
//        // Set click listeners for number buttons
//        numberButtons.forEach { button ->
//            button.setOnClickListener {
//                if (operator.isEmpty()) {
//                    value1 += button.text
//                } else {
//                    value2 += button.text
//                }
//                textView.text = "$value1 $operator $value2"
//            }
//        }
//
//        // Set click listeners for operator buttons
//        operatorButtons.forEach { button ->
//            button.setOnClickListener {
//                operator = button.text.toString()
//                textView.text = "$value1 $operator"
//            }
//        }
//
//        // Set click listener for equals button
//        equalsButton.setOnClickListener {
//            val result = when (operator) {
//                "+" -> value1.toInt() + value2.toInt()
//                "-" -> value1.toInt() - value2.toInt()
//                "*" -> value1.toInt() * value2.toInt()
//                "/" -> value1.toInt() / value2.toInt()
//                else -> 0
//            }
//            textView.text = result.toString()
//            // Reset values for next calculation
//            value1 = ""
//            value2 = ""
//            operator = ""
//        }
        val numberslist= listOf(
            findViewById<Button>(R.id.btn1),
            findViewById(R.id.btn2),
            findViewById(R.id.btn3),
            findViewById(R.id.btn4),
            findViewById(R.id.btn5),
            findViewById(R.id.btn6),
            findViewById(R.id.btn7),
            findViewById(R.id.btn8),
            findViewById(R.id.btn9),
            )
        val operatorslist=listOf(
            findViewById<Button>(R.id.plus),
            findViewById<Button>(R.id.minus),
            findViewById<Button>(R.id.multiply),
            findViewById<Button>(R.id.divison)
        )

        numberslist.forEach{
            button -> button.setOnClickListener{
                if(operator.isEmpty()){
                    value1=value1+button.text
                }
            else{
                value2=value2+button.text
                }
            textView.text="$value1 $operator $value2"
        }
        }
        operatorslist.forEach{
            button->button.setOnClickListener{
                operator=button.text.toString()
            textView.text="$value1 $operator"
        }
        }
        val equals=findViewById<Button>(R.id.equals)
        equals.setOnClickListener {
            val result=when (operator){
                "+" -> value1.toInt()+value2.toInt()
                "-" -> value1.toInt()+value2.toInt()
                "*" -> value1.toInt()*value2.toInt()
                "/"->value1.toInt()/value2.toInt()
                else -> 0
            }
            textView.text=result.toString()
            value1=""
            value2=""
            operator=""
        }
    }
}