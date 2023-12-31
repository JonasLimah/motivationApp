package com.example.motivation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.databinding.ActivityMainBinding
// feito a implementação dos metodos e preparado o onclickListener
class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //comunicação codigo com layout
        setContentView(binding.root)//usando metodos da raiz
        binding.buttonNewPhrase.setOnClickListener(this)//setando o evento de click
        supportActionBar?.hide()// esconder barra de navegaçao
        // atribuindo ao texto welcome o valor do nosso storage
        binding.textWelcome.text ="Olá ${SecurityPreferences(this).getString("USER_NAME")}"
    }

    override fun onClick(view: View) {
        if(view.id == R.id.button_new_phrase){
            click()
        }
    }
    private fun click(){
        Toast.makeText(this,"vitoria",Toast.LENGTH_SHORT).show()
    }
}