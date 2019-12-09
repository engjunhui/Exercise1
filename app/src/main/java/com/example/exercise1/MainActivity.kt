package com.example.exercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast
import java.util.*
import android.view.View.Y
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculate: Button = findViewById(R.id.buttonCalculate)
        calculate.setOnClickListener { Calculate() }
    }
    private fun Calculate() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText1: EditText = findViewById(R.id.editTextCarPrice)
        val st1 = resultText1.getText().toString().toDouble()
        val resultText2: EditText = findViewById(R.id.editTextDownPayment)
        val st2 = resultText2.getText().toString().toDouble()
        val resultText3: EditText = findViewById(R.id.editTextLoanPeriod)
        val st3 = resultText3.getText().toString().toDouble()
        val resultText4: EditText = findViewById(R.id.editTextInterestRate)
        val st4 = resultText4.getText().toString().toDouble()
        val result1 : TextView=findViewById(R.id.textViewLoan)
        val Carloan = st1 - st2
        result1.setText(Carloan.toString())
        val result2 : TextView=findViewById(R.id.textViewInterest)
        val Interest = Carloan * st4 * st3
        result2.setText(Interest.toString())
        val result3 : TextView=findViewById(R.id.textViewMonthlyRepayment)
        val MonthlyRepayment = (Carloan + Interest)/st3/12
        result3.setText(MonthlyRepayment.toString())
    }

}
