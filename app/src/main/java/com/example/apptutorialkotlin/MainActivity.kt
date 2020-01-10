package com.example.apptutorialkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        選項的Menu
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
        //return super.onCreateOptionsMenu(menu)
    }
}
