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
        binding.buttonClick.setOnClickListener(this)//setando o evento de click

    }

    override fun onClick(view: View) {
        click()
    }
    private fun click(){
        if (R.id.button_click == binding.buttonClick.id){
            Toast.makeText(this,"vitoria",Toast.LENGTH_SHORT).show()
        }
    }
}