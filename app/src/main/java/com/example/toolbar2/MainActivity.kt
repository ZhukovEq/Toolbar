package com.example.toolbar2

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageleft = findViewById<ImageView>(R.id.leftImage) as ImageView
        val imageRight = findViewById<ImageView>(R.id.rightImage) as ImageView
        val textToolbar = findViewById<TextView>(R.id.textJoyrnal) as TextView
        val rightList = findViewById<ListView>(R.id.rightListView) as ListView
        val contextMenu = findViewById<FrameLayout>(R.id.content_frame) as FrameLayout

        imageleft.setOnClickListener(){
            Toast.makeText(this@MainActivity, "Кнопка назад", Toast.LENGTH_SHORT).show()

        }
        imageRight.setOnClickListener() {
            Toast.makeText(this@MainActivity, "Кнопка меню", Toast.LENGTH_SHORT).show()
           // setContentView(R.layout.menu)

        }


    }

}