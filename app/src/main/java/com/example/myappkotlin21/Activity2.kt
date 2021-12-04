package com.example.myappkotlin21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.example.myappkotlin21.R

class Activity2 : AppCompatActivity() {
    protected override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_2)
            val toast: Toast = Toast.makeText(this, "Буря мглою небо кроет", Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP, 0, 100)
            toast.show()
        }

    protected override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_2)
        val toast: Toast = Toast.makeText(this, "Вихри снежные крутя", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0, 100)
        toast.show()
    }

    protected override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_2)
        val toast: Toast = Toast.makeText(this, "То заплачет как дитя", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0, 100)
        toast.show()
    }

    protected override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_2)
        val toast: Toast = Toast.makeText(this, "То как зверь она завоет", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0, 100)
        toast.show()
    }


    }