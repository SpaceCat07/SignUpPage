package com.example.signuppage

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.signuppage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.btnSign.setOnClickListener {
            val email = binding.inputEmail.text.toString()
            val fullName = binding.inputFullName.text.toString()
            val userName = binding.inputUsername.text.toString()
            val password = binding.inputPassword.text.toString()
            val hasil = "Email is $email, Fullname is $fullName, Username is $userName"

            if (email != "" && fullName != "" && userName != "" && password != "") {
                Toast.makeText(this, hasil, Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Please fill all section above", Toast.LENGTH_SHORT).show()
            }
        }
    }
}