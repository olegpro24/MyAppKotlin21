package com.example.myappkotlin21

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myappkotlin21.R


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var buttonGoToAct2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // присваиваем значение объекту "кнопка" элемента верстки "кнопка" как кнопка
        buttonGoToAct2 = findViewById<View>(R.id.buttonGoToAct2) as Button

        buttonGoToAct2!!.setOnClickListener(this) // установка прослушивания события клика на кнопке объекту данного класса
    }

    override fun onClick(V: View) {
        if (V.id == R.id.buttonGoToAct2) {
            val myIntent = Intent(this, Activity2::class.java)
            startActivity(myIntent)
        }
    }
}
