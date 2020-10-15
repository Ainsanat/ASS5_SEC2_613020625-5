package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun showData(v: View) {
        var radioGroup: RadioGroup = findViewById(R.id.sex)
        var selectdID: Int = radioGroup.checkedRadioButtonId
        var radioButton: RadioButton = findViewById(selectdID)

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("empData",
            Employee(
                edt_name.text.toString(),
                radioButton.text.toString(),
                edt_email.text.toString(),
                edt_salary.text.toString()))
        startActivity(intent)
    }
    fun resetData(v: View){
        edt_name.text.clear()
        edt_email.text.clear()
        edt_salary.text.clear()
    }
}