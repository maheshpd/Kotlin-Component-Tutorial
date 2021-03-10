package com.createsapp.kotlincomponenttutotial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Widget
    private lateinit var userName: EditText
    private lateinit var password: EditText
    private lateinit var phoneNo: EditText
    private lateinit var submitBtn: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById(R.id.user_name)
        password = findViewById(R.id.password_edt)
        phoneNo = findViewById(R.id.phoneNo)
        submitBtn = findViewById(R.id.submitBtn)

        submitBtn.setOnClickListener {

            var userName = userName.text.toString().trim()
            var password  = password.text.toString().trim()
            var phoneno = phoneNo.text.toString().trim()

            when {
                TextUtils.isEmpty(userName) -> {
                    Toast.makeText(applicationContext,"Please enter user name",Toast.LENGTH_SHORT).show()
                }TextUtils.isEmpty(password) -> {
                Toast.makeText(applicationContext, "Password filed is empty", Toast.LENGTH_SHORT).show()
                }TextUtils.isEmpty(phoneno) -> {
                Toast.makeText(applicationContext, "Please enter Phone no", Toast.LENGTH_SHORT).show()
                } else -> {

                val intent = Intent(applicationContext, SecondActivity::class.java)
                intent.putExtra("username",userName)
                intent.putExtra("password",password)
                intent.putExtra("phoneNo", phoneno)

                //do your function
                Toast.makeText(applicationContext, "Username: ${userName}  Password ${password} PhoneNo ${phoneno}", Toast.LENGTH_LONG).show()
                }

            }
        }

    }
}