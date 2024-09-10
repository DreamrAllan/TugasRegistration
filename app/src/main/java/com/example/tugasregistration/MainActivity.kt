package com.example.signupapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.tugasregistration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Binding
    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        // On button click
        binding.signUpButton.setOnClickListener {
            val email = binding.emailInput.text.toString()
            val fullname = binding.fullnameInput.text.toString()
            val username = binding.usernameInput.text.toString()
            val password = binding.passwordInput.text.toString()

            // Toast user input data
            if (email.isEmpty() || fullname.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Mohon isi semua data terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email: $email\nFullname: $fullname\nUsername: $username\nPassword: $password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
