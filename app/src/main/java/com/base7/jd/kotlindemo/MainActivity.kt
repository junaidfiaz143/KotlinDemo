package com.base7.jd.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var str1: String? = null
    var str2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num1: Int = 0
        var num2: Int = 0

        val txtNum1: EditText = findViewById(R.id.txtNum1) as EditText
        val txtNum2: EditText = findViewById(R.id.txtNum2) as EditText

        val btnCalculate: Button = findViewById(R.id.btnCalculate) as Button

        btnCalculate.setOnClickListener {
            /*if (txtNum1.text != null && txtNum2.text != null) {
                str1 = txtNum1.text.toString()
                num1 = Integer.parseInt(str1)

                str2 = txtNum2.text.toString()
                num2 = Integer.parseInt(str2)
            }

            Toast.makeText(this, "$num1 + $num2 = ${check(num1, num2)}", Toast.LENGTH_LONG).show()*/

            startActivity(Intent(this, ViewPagerActivity::class.java))
        }

    }

    fun check(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
