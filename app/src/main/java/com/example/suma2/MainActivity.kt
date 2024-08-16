package com.example.suma2

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.suma2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var resultado: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        n1=binding.txtN1
        n2=binding.txtN2
        resultado=binding.txtResultado
        setContentView(binding.root)

    }

    fun sumar(view:View){
        var vn1=n1.text.toString().toFloat()
        var vn2=n2.text.toString().toFloat()
        var vr=vn1+vn2
        resultado.setText(vr.toString())




    }
}