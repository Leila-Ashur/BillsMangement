package com.example.billsmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.billsmanagement.databinding.ActivityLoginBinding


class Login : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btnLogin.setOnClickListener {
//            val intent= Intent(this,DashBoad::class.java)
//            startActivity(intent)
            validateRegistration()
        }

    }
    fun  validateRegistration(){

var UserName=binding.etUser.text.toString()
        var password=binding.etPass.text.toString()
        var ConfirmPassword=binding.etConfirm.text.toString()
        var error=false
        if (UserName.isBlank()){
            binding.etUser.error="name required"
         error=true
        }
        if (password.isBlank()){
            binding.etPass.error="Email required"
            error=true
        }
        if (ConfirmPassword.isBlank()){
            binding.etConfirm.error="Password require"
        }
        if (!error){
            val intent=Intent(this,DashBoad::class.java)
            startActivity(intent)

        }

    }



}
