package com.example.assignment5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        txt_name.text = "Employee name: ${newEmployee?.name}"
        txt_gender.text = "Gender ${newEmployee?.gender}"
        txt_email.text = "Email: ${newEmployee?.mail}"
        txt_salary.text = "Salary: ${newEmployee?.salary}"
    }

    fun close(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}