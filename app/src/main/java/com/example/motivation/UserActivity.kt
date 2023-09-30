package com.example.motivation

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.Toast
import com.example.motivation.databinding.ActivityMainBinding
import com.example.motivation.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonSave.setOnClickListener(this)
        supportActionBar?.hide()

    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_save) {
            click()
        }
    }



    private fun click() {
        val name = binding.editInputName.text.toString() // pegando nome
        if (name != "") {
            // security é a forma de armazenar dados pequenos como LocalStorage
            // criamos uma classe SecurityPreferences para facilitar no uso
           SecurityPreferences(this).storeString("USER_NAME",name)
            // intent modo de navegar nas activitys
           val intent =  Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, R.string.validation_name, Toast.LENGTH_SHORT).show()
        }

    }


}