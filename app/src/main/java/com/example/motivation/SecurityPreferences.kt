package com.example.motivation

import android.content.Context
import android.content.SharedPreferences
// classe security preference
class SecurityPreferences(context : Context) {
    private val security: SharedPreferences =
    context.getSharedPreferences("Motivation",Context.MODE_PRIVATE)

    //metodo de armazenar dados
    fun storeString(key:String,str: String){
        security.edit().putString(key,str).apply()
    }
    //metodo de pegar dados
    fun getString(key: String):String{
     return security.getString(key,"") ?: ""
    }
}