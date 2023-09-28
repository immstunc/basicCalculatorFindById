package com.merveselva.ilkproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.merveselva.ilkproje.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var resultTextView : TextView
    lateinit var firstNumberEditText : EditText
    lateinit var secondNumberEditText : EditText
    lateinit var sumButton : Button
    lateinit var subButton : Button
    lateinit var multiplyButton : Button
    lateinit var divideButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView = findViewById(R.id.resultTextView)
        firstNumberEditText = findViewById(R.id.firstNumberEditText)
        secondNumberEditText = findViewById(R.id.secondNumberEditText)
        sumButton = findViewById(R.id.sumButton)
        subButton = findViewById(R.id.subButton)
        multiplyButton = findViewById(R.id.multiplyButton)
        divideButton = findViewById(R.id.divideButton)

    }
    fun sumClicked(view: View){
        val n1 = firstNumberEditText.text.toString().toIntOrNull()
        val n2 = secondNumberEditText.text.toString().toIntOrNull()
        if (n1 != null && n2 != null){
            resultTextView.text = "RESULT: ${n1+n2}"
        }
        else{
            resultTextView.text = "Please Enter a valid value"
        }
    }

    fun subClicked (view: View){
        val n1 = firstNumberEditText.text.toString().toIntOrNull()
        val n2 = secondNumberEditText.text.toString().toIntOrNull()
        if (n1 != null && n2 != null){
            resultTextView.text = "RESULT: ${n1-n2}"
        }
        else{
            resultTextView.text = "Please Enter a valid value"
        }
    }

    fun multiplyClicked (view: View){
        val n1 = firstNumberEditText.text.toString().toIntOrNull()
        val n2 = secondNumberEditText.text.toString().toIntOrNull()
        if (n1 != null && n2 != null){
            resultTextView.text = "RESULT: ${n1*n2}"
        }
        else{
            resultTextView.text = "Please Enter a valid value"
        }
    }

    fun divedeClicked  (view: View){
        val n1 = firstNumberEditText.text.toString().toIntOrNull()
        val n2 = secondNumberEditText.text.toString().toIntOrNull()
        if (n1 != null && n2 != null){
            resultTextView.text = "RESULT: ${n1/n2}"
        }
        else{
            resultTextView.text = "Please Enter a valid value"
        }
    }

}